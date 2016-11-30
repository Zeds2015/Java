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
        
        private static int pocaoAtaque1 = 15, pocaoAtaque2 = 10,
        pocaoAtaque3 = 5, pocaoDefesa1 = 15,
        pocaoDefesa2 = 10,pocaoDefesa3 = 5;
    
    public void comprarPocao(int numero)
    {
        recarregarPocao();
        
        if(!semPocaoAtaque() || !semPocaoDefesa()){
        switch(numero)
        {
            case 111: pocaoAtaque1 --;
            break;
            case 112: pocaoAtaque2 --;
            break;
            case 113: pocaoAtaque3 --;
            break;
            case 211: pocaoDefesa1 --;
            break;
            case 212: pocaoDefesa2 --;
            break;
            case 213: pocaoDefesa3 --;
            break;
        }
    }
}
    
    private void recarregarPocao()
    {
        if(semPocaoAtaque())
        {
           pocaoAtaque1+= 2; 
           pocaoAtaque2+= 3; 
           pocaoAtaque3+= 4;
        }
        else if(semPocaoDefesa())
        {
         pocaoDefesa1+= 2;
         pocaoDefesa2+= 3; 
         pocaoDefesa3+= 4;
        }
    }
    
    @Override
    public String toString()
    {
        return "Quantidade de poção no estoque...\n Poção Ataque Fraco: " + pocaoAtaque1 + "\nPoção Ataque Médio: " + pocaoAtaque2 +
               "\nPocao Ataque Forte: " + pocaoAtaque3 + "\nPocao Defesa Fraco: " + pocaoDefesa1 + "\nPoção Defesa Médio: " + pocaoDefesa2 +
                "\nPoção Defesa Forte: " + pocaoDefesa3;
    }
    
    private boolean semPocaoAtaque() 
    {
        return pocaoAtaque1 == 0 || pocaoAtaque2 == 0 || pocaoAtaque3 == 0;
    }
    private boolean semPocaoDefesa() 
    {
        return pocaoDefesa1 == 0 || pocaoDefesa2 == 0 || pocaoDefesa3 == 0;
    }
}