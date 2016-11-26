/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogosw;
import java.util.Scanner;
/**
 *
 * @author Mateus
 */
public class JogoSW {

    static Personagem personagem;
    static Escolhas escolha;
    static Jogador player;
    static Scanner digitar = new Scanner(System.in);
    /**
     * @param args 
     */
    public static void main(String[] args) {
        //Coisas Inuteis que todo jogo tem.
        String nome;
        int idade, sexo;
        boolean escolheu = false;
        
        System.out.printf("Digite o seu nick, meu caro Jedai: ");
        nome = digitar.nextLine();
        System.out.printf("Digite sua idade, nobre guerreiro: ");
        idade = digitar.nextInt();
        System.out.printf("Por fim, digite o seu sexo (1) Masculino (2) Feminino: ");
        sexo = digitar.nextInt();
        
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
        if(lado == 1)
        {
            System.out.println("Lado Azul da Força - Ashla");
            System.out.println("Dificil de ver sempre em movimento está o futuro");
            System.out.println("Escolha a classe do seu personagem...");
            System.out.println("(1) Rebeldes");
            System.out.println("(2) Dróides do Bem");
            System.out.println("(3) Pilotos"); 
            System.out.println("(Qualquer outro número) Voltar para escolher o lado");
            classe = digitar.nextInt();
            
            if(classe < 4 && classe > 0)
            {
                escolheu = true;
                escolha.Classe(1, classe);
            }
        }
        
        else
        {
            System.out.println("Lado Negro da Força - Bogan");
            System.out.println("É preciso ter força, para resistir ao lado sombrio da força, só o fraco o adota.");
            System.out.println("Escolha a classe do seu personagem...");
            System.out.println("(1) Stromtrooper");
            System.out.println("(2) Dróides do mal");
            System.out.println("(3) Body Hunter"); 
            System.out.println("(Qualquer outro número) Voltar para escolher o lado");
            classe = digitar.nextInt();
            
            if(classe < 4 && classe > 0)
            {
                escolheu = true;
                escolha.Classe(1, classe);
            } 
        }
        AtribuindoPontos();
    }
 }
    
    public static void AtribuindoPontos()
    {
        personagem = new Personagem(player);
        
        System.out.println("-----------------------------------------------------------------------");
        int i = 5, distribuir;
        while(i > 0)
        {
            System.out.printf("Você tem %d pontos para distribuir...",i);
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
                default:
                        personagem.aumentaVida(1);
                        i--;
           }
            System.out.printf("\nNick do Jogador: %s",player.toString());
            System.out.printf("\nClasse do personagem: %s",personagem.toString());
            System.out.printf("\nPontos de Ataque: %d",personagem.retornaAtaque());
            System.out.printf("\nPontos de Defesa: %d",personagem.retornaDefesa());
            System.out.printf("\nPontos de Vida: %d\n",personagem.retornaVida());
    }
  }
    public void Comprar()
    {
        //Vou jogar amanhã vejo isso!
    }
}

