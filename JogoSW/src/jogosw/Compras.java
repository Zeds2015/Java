/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogosw;

/**
 *
 * @author Mateus
 */
public class Compras {
        
        private static int armaAtaque1 = 15, armaAtaque2 = 10,
        armaAtaque3 = 5, escudoDefesa1 = 15,
        escudoDefesa2 = 10,escudoDefesa3 = 5;
    
    public void comprarPocao(int numero)
    {
        recarregarPocao();
        
        if(!semPocaoAtaque() || !semPocaoDefesa()){
        switch(numero)
        {
            case 111: armaAtaque1 --;
                      Mochila.setArmaAtaque1(1);
                       break;
            
            case 112: armaAtaque2 --;
                      Mochila.setArmaAtaque2(1);
                        break;
            
            case 113: armaAtaque3 --;
                      Mochila.setArmaAtaque3(1);
                        break;
            
            case 211: escudoDefesa1 --;
                      Mochila.setEscudoDefesa1(1);
                       break;
            
            case 212: escudoDefesa2 --;
                      Mochila.setEscudoDefesa2(1);
                        break;
                        
            case 213: escudoDefesa3 --;
                      Mochila.setEscudoDefesa3(1);  
                        break;
        }
    }
}
    
    private void recarregarPocao()
    {
        if(semPocaoAtaque())
        {
           armaAtaque1+= 2; 
           armaAtaque2+= 3; 
           armaAtaque3+= 4;
        }
        else if(semPocaoDefesa())
        {
         escudoDefesa1+= 2;
         escudoDefesa2+= 3; 
         escudoDefesa3+= 4;
        }
    }
    
    @Override
    public String toString()
    {
        return "Quantidade de poção no estoque...\n Poção Ataque Fraco: " + armaAtaque1 + "\nPoção Ataque Médio: " + armaAtaque2 +
               "\nPocao Ataque Forte: " + armaAtaque3 + "\nPocao Defesa Fraco: " + escudoDefesa1 + "\nPoção Defesa Médio: " + escudoDefesa2 +
                "\nPoção Defesa Forte: " + escudoDefesa3;
    }
    
    private boolean semPocaoAtaque() 
    {
        return armaAtaque1 == 0 || armaAtaque2 == 0 || armaAtaque3 == 0;
    }
    private boolean semPocaoDefesa() 
    {
        return escudoDefesa1 == 0 || escudoDefesa2 == 0 || escudoDefesa3 == 0;
    }
}