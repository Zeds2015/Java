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
public class Batalha {

    private  Inimigo inimigo;
    private  Personagem personagem;
    private static int vitoria = 0;
    
    Batalha(Inimigo inimigo, Personagem personagem) {
        this.inimigo = inimigo;
        this.personagem = personagem;
    }
    
    public void atacar()
    {   
        if(inimigo.getDefesa() <= 0)
        {
            inimigo.perdeVida(personagem.getAtaque());
        }
        else
        {
            inimigo.diminuiDefesa(personagem.getAtaque());
        }
        zerarDefesa();
    }
    public void defender()
    {
        if(personagem.getDefesa() <= 0)
        {
            personagem.perdeVida(inimigo.getAtaque());
        }
        else
        {
            personagem.diminuiDefesa(inimigo.getAtaque());
        }
        zerarDefesa();
    }

    
    public void usarItens(int numero)
    {
        switch(numero)
        {
            case 1: if(Mochila.getArmaAtaque1() > 0)
            {
                    personagem.aumentaAtaque(10*personagem.getNivel(),5*personagem.getNivel());
                    Mochila.setArmaAtaque1(-1);
            }
            break;
            case 2: if(Mochila.getArmaAtaque2() > 0)
            {
                    personagem.aumentaAtaque(20*personagem.getNivel(),10*personagem.getNivel());
                    Mochila.setArmaAtaque2(-1);
            }
            break;
            case 3: if(Mochila.getArmaAtaque3() > 0)
            {
                    personagem.aumentaAtaque(30*personagem.getNivel(),15*personagem.getNivel());
                    Mochila.setArmaAtaque3(-1);
            }
            break;
            case 4: if(Mochila.getEscudoDefesa1() > 0)
            {
                    personagem.aumentaDefesa(10*personagem.getNivel(),5*personagem.getNivel());
                    Mochila.setEscudoDefesa1(-1);
            }
            break;
            case 5: if(Mochila.getEscudoDefesa2() > 0)
            {
                    personagem.aumentaDefesa(20*personagem.getNivel(),10*personagem.getNivel());
                    Mochila.setEscudoDefesa2(-1);
            }
            break;
            case 6: if(Mochila.getEscudoDefesa3() > 0)
            {
                    personagem.aumentaDefesa(30*personagem.getNivel(),15*personagem.getNivel());
                    Mochila.setEscudoDefesa3(-1);
            }
            break;
        }
    }
    public boolean morrer()
    {   
        return  inimigo.getVida() <= 0;
    }
    
    @Override
    public String toString()
    {
        return  
                "\nVitorias: " + vitoria +
                
                "\nNivel do Inimigo: " + inimigo.getNivel() + "\t\t Nivel Personagem: " + personagem.getNivel() + 
                "\nAtaque do Inimigo: " + inimigo.getAtaque() + "\t\t Ataque Personagem: " + personagem.getAtaque() + 
                "\nDefesa do Inimigo: " + inimigo.getDefesa() + "\t\t Defesa do Personagem: " + personagem.getDefesa() +
                "\nEscudo do Inimigo: " + inimigo.getEscudo() + "\t\t Escudo do Personagem: " + personagem.getEscudo() +
                "\nVida do Inimigo: " + inimigo.getVida() + "\t\t Vida do Personagem: " + personagem.getVida();
    }
    
    public boolean fugir()
    {
        Random aleartorio = new Random();
        int x = aleartorio.nextInt();
        if(x % 2 == 0)
        {
            x/=5;
            if(x >= 100)
            {
                return true;
            }
        }
        return false;
    }
    
    
    public int vitoria()
    {
        return ++vitoria;
    }
    
    public void gameOver()
    {
        System.out.println("GAME OVER!!!");
        System.exit(0);
    }
    
    public void zerarDefesa()
    {
        if(inimigo.getDefesa() < 0)
        {
            inimigo.setDefesa(0);
        }
        if(personagem.getDefesa() < 0)
        {
            personagem.setDefesa(0);
        }
    }
}
