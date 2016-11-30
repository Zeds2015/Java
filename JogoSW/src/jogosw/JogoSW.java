/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogosw;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Mateus
 */
public class JogoSW {
    
    
    static Compras compra;
    static Mochila mochila;
    static Personagem personagem;
    static Escolhas escolha;
    static Jogador player;
    static Batalha batalha;
    static Scanner digitar = new Scanner(System.in);
    static batalhaFactory fabricaDeBatalhas;
    
    /**
     * @param args 
     */
    public static void main(String[] args)
    {
        //Coisas Inuteis que todo jogo tem.
        String nome;
        int idade, sexo;
        boolean escolheu = false;
        
        System.out.printf("Digite o seu nick, meu caro Jedai: ");
        nome = digitar.nextLine();
        
        do{
        System.out.printf("Digite sua idade, nobre guerreiro: ");
        idade = digitar.nextInt();
        }while(idade <= 0 || idade > 120);
        
        do{
        System.out.printf("Por fim, digite o seu sexo (1) Masculino (2) Feminino: ");
        sexo = digitar.nextInt();
        }while(sexo < 1 || sexo > 2);
        
        player = new Jogador(nome,idade,sexo);
        Escolhendo(escolheu);
    }
    
    public static void Escolhendo(boolean escolheu)
    {
        System.out.println("-----------------------------------------------------------------------");
        
        int lado,classe;
        escolha = new Escolhas(player);
        while(!escolheu)
      {
        System.out.println("Escolha o seu lado da força. (1) Ashla (lado branco da força) e (2) Bogan (lado negro da força)");
        lado = digitar.nextInt();
        
            switch (lado) {
                case 1:
                    System.out.println("Lado Azul da Força - Ashla");
                    System.out.println("Dificil de ver sempre em movimento está o futuro");
                    System.out.println("Escolha a classe do seu personagem...");
                    System.out.println("(1) Rebeldes");
                    System.out.println("(2) Dróides do Bem");
                    System.out.println("(3) Pilotos");
                    System.out.println("(Qualquer outro número) Voltar para escolher o lado");
                    classe = digitar.nextInt();
                    escolha.escolheLado(1);
                    if(classe < 4 && classe > 0)
                    {
                        escolheu = true;
                        escolha.escolheClasse(classe);
                    }       break;
                case 2:
                    System.out.println("Lado Negro da Força - Bogan");
                    System.out.println("É preciso ter força, para resistir ao lado sombrio da força, só o fraco o adota.");
                    System.out.println("Escolha a classe do seu personagem...");
                    System.out.println("(4) Stromtrooper");
                    System.out.println("(5) Dróides do mal");
                    System.out.println("(6) Body Hunter");
                    System.out.println("(Qualquer outro número) Voltar para escolher o lado");
                    classe = digitar.nextInt();
                    escolha.escolheLado(2);
                    if(classe > 3 && classe < 7)
                    {
                        escolheu = true;
                        escolha.escolheClasse(classe);
                    }       break;
                default:
                    escolheu = false;
                    break;
            }
  }
        AtribuindoPontos();
}
        
    
    public static void AtribuindoPontos()
    {
        personagem = new Personagem(player);
        
        System.out.println("-----------------------------------------------------------------------");
        int i = 5, distribuir;
        while(i > 0)
        {
            System.out.printf("Você tem %d pontos (surpresa hehe...) para distribuir...",i);
            System.out.println("Escolha entre ataque, defesa e vida");
            System.out.println("(1) Ataque");
            System.out.println("(2) Defesa");
            System.out.println("(3) Vida");
            distribuir = digitar.nextInt();
            
            switch(distribuir)
            {
                case 1: 
                        personagem.aumentaAtaque(1,0);
                        i--;
                        break;
                        
                case 2: 
                        personagem.aumentaDefesa(1,0);
                        i--;
                        break;
                case 3:
                        personagem.aumentaVida(1);
                        i--;
                        break;
           }
            System.out.printf("\nNick do Jogador: %s",player.toString());
            System.out.printf("\nClasse do personagem: %s",escolha.toString());
            System.out.printf("\nPontos de Ataque: %d",personagem.getAtaque());
            System.out.printf("\nPontos de Defesa: %d",personagem.getDefesa());
            System.out.printf("\nPontos de Vida: %d\n",personagem.getVida());
    }
        Comprar(0);
  }
    
    
    public static void Comprar(int codigo)
    {
        System.out.println("-----------------------------------------------------------------------");
        String resposta;
        int numero, pocao;
        char primeiraLetra = 'N';
        
        if(codigo != 1)
        {
        System.out.println("Deseja comprar algo antes, de ir para a batalha?");
        resposta = digitar.next();
        primeiraLetra = resposta.charAt(0);
        System.out.println("\n");
        }
        
        
        if(primeiraLetra == 'S' || primeiraLetra == 's' || codigo == 1)
        {
            compra = new Compras();
            System.out.println("Escolha o tipo de produto que deseja comprar...");
            
            do {
            System.out.println("\n(1) Poção de Ataque");
            System.out.println("(2) Poção de Defesa");
            numero = digitar.nextInt();
            }while(numero < 1 || numero > 2);
            
            if(numero == 1)
            {
                do{
            System.out.println("\n(1) Poção Ataque Fraco");
            System.out.println("(2) Poção Ataque Médio");
            System.out.println("(3) Poção Ataque Forte\n");
            pocao = digitar.nextInt();
                   }while(pocao < 1 || pocao > 3);
            
                switch(pocao)
                {
                case 1: Comprando(111);
                break;
                case 2: Comprando(112);
                break;
                default: Comprando(113);
                }
            }
          
            else
            {
                do{
            System.out.println("\n(1) Poção Defesa Fraco");
            System.out.println("(2) Poção Defesa Médio");
            System.out.println("(3) Poção Defesa Forte");
            pocao = digitar.nextInt();
                }while(pocao < 1 || pocao > 3);
                
                switch(pocao)
                {
                case 1: Comprando(211);
                break;
                case 2: Comprando(212);
                break;
                default: Comprando(213);
                }
            }
        }
        else
        {
            Batalha();
        }
  }
    
    private static void Comprando(int codigo)
    {
        boolean semDinheiro = false;
        String resposta;
        
        switch (codigo) {
            case 111:
            case 211:
                if(personagem.getDinheiro() >= 1000)
                {
                    personagem.gastaDinheiro(1000);
                    compra.comprarPocao(codigo);
                }
                else
                {
                    semDinheiro = true;
                }   break;
            case 112:
            case 212:
                if(personagem.getDinheiro() >= 2000)
                {
                    personagem.gastaDinheiro(2000);
                    compra.comprarPocao(codigo);
                }
                else
                {
                    semDinheiro = true;
                }   break;
            default:
                if(personagem.getDinheiro() >= 5000)
                {
                    personagem.gastaDinheiro(5000);
                    compra.comprarPocao(codigo);
                }
                else
                {
                    semDinheiro = true;
                }   break;
        }
        
            if(semDinheiro)
                System.out.println("Você não tem dinheiro para comprar a poção");
            else
            {
            System.out.printf("\nDinheiro do personagem: %f",personagem.getDinheiro());
                System.out.printf("\n Quantidade de produtos em estoque: %s",compra.toString());
            }
            
            System.out.println("\nDeseja Comprar mais produtos?");
            resposta = digitar.next();
            if(resposta.charAt(0) == 'S' || resposta.charAt(0) == 's')
            {
                Comprar(1);
            }
            else
            {
                Batalha();
            }
    }
    
    private static int vitorias = 0, nivel = 1;
    
    
    
    private static void Batalha()
    {
        int opcao;
        
        System.out.println("-----------------------------------------------------------------------");
        fabricaDeBatalhas = new batalhaFactory(personagem);
        batalha = fabricaDeBatalhas.gerarBatalha();
        mochila = new Mochila();
         
         System.out.println("\n\nEscolha uma opção e se prepare para luta\n\n");
       
         do{
         System.out.println(batalha.toString());    
         System.out.println("\n(1) Atacar");
         System.out.println("(2) Usar Poção");
         System.out.println("(3) Fugir");
        //System.out.println("(4) Invocar o Goku");
         opcao = digitar.nextInt();
         
         switch(opcao)
         {
             case 1: batalha.atacar();
                     batalha.defender();
             break;
             
             case 2:
                     int numero;

                     do{
                     System.out.println(mochila.toString());
                     System.out.println("\n(1) Arma Nivel 1");
                     System.out.println("(2) Arma Nivel 2");
                     System.out.println("(3) Arma Nivel 3");
                     System.out.println("(4) Escudo Nivel 1");
                     System.out.println("(5) Escudo Nivel 2");
                     System.out.println("(6) Escudo Nivel 3\n");
                     numero = digitar.nextInt();
                        }while(numero < 1 || numero > 6);                     
                     
                     batalha.usarItens(numero);
                 break;
                 
             case 3:  if(batalha.fugir())
                           Comprar(0);
             break;
         }
         
         if(personagem.getVida() <= 0)
             batalha.gameOver();
            
      }while(!batalha.morrer());
         
         nivel = personagem.getNivel();
         vitorias = batalha.vitoria();
        
         if(vitorias % 3 == 0)
         {
             personagem.aumentaNivel();
             personagem.aumentaVida(2*nivel);
             personagem.aumentaAtaque(3*nivel, 2*nivel);
             personagem.aumentaDefesa(3*nivel, 2*nivel);
             personagem.recebeDinheiro(500);
         }
         Batalha();
    }
}