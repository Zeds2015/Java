/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogosw;

import java.util.Random;

/**
 *
 * @author Mateus
 */
public class batalhaFactory {

    private static Personagem personagem;
    private static Inimigo inimigo;
    
    public batalhaFactory(Personagem personagem) {
        this.personagem  = personagem;
        inimigo = new Inimigo();
    }
    
    public boolean conferirBatalha(){
            return inimigo.getNivel() > personagem.getNivel() + 50;
    }
    
    public boolean gerarInimigo()
    {
        double numero;
        int nivel,ataque,defesa,vida,arma,escudo;

        do{
        Random aleartorio = new Random();
        numero = aleartorio.nextDouble();
        }while(numero <= 0 && numero > 1);
        
        
        nivel = (int) (numero * 100) + 1;
        ataque = (int) (numero* nivel) + 1;
        defesa = (int) (numero * nivel) + 1;
        vida = (int) (numero * nivel) + 1;
        arma = (int) (numero * ataque) + 1;
        escudo = (int) (numero * defesa) + 1;
        
        inimigo.setNivel(nivel);
        inimigo.setAtaque(ataque);
        inimigo.setDefesa(defesa);
        inimigo.setVida(vida);
        inimigo.setArma(arma);
        inimigo.setEscudo(escudo);
        return  inimigo.getNivel() > 0 && inimigo.getVida() > 100;
    }
    
    public Batalha gerarBatalha()
    {
        gerarInimigo();
        while(conferirBatalha())
        {
        gerarInimigo();
        conferirBatalha();
        }
        return new Batalha(inimigo,personagem);
    }
}
