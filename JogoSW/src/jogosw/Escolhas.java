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
public class Escolhas {
    
    Jogador jogador;

    public Escolhas(Jogador jogador) {
        this.jogador = jogador;
    }
    
    Personagem player = new Personagem(jogador);
    
    
    public boolean Lado(int escolha)
    {
        return escolha == 1;
    }
    
    public void Classe(int escolha, int classe)
    {
        if(Lado(escolha))
        {
            switch(classe){
                case 1: player.colocarNome("Rebeldes");
                break;
                case 2: player.colocarNome("Dróides do Bem");
                break;
                default: player.colocarNome("Pilotos");
            }
        }
        
        else
        {
            switch(classe){
                case 1: player.colocarNome("Stromtrooper");
                break;
                case 2: player.colocarNome("Dróides do Mal");
                break;
                default: player.colocarNome("Body Hunter");
            }
        }
    }
}
