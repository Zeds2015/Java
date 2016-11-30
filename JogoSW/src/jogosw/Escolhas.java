/*
 * Propósito: O jogador irá escolher uma classe, e um lado, para jogar.
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
       
    public enum Lado
    {
        Bogan,
        Ashla,
    }
    
    private enum Classe
    {
        Rebedes,
        DroidesBem,
        Pilotos,
        Stromtrooper,
        DroidesMal,
        BodyHunter
    }
    private String classe,lado;
    
    
    public void escolheLado(int numero)
    {
        if (numero == 1) lado = Lado.Bogan.toString();
        else lado = Lado.Ashla.toString();
    }
    
    public String escolheClasse(int numero)
    {
        switch(numero)
        {
            case 1: classe = Classe.Rebedes.toString();
            break;
            case 2: classe = Classe.DroidesBem.toString();
            break;
            case 3: classe = Classe.Pilotos.toString();
            break;
            case 4: classe = Classe.Stromtrooper.toString();
            break;
            case 5: classe = Classe.DroidesMal.toString();
            break;
            default: classe = Classe.BodyHunter.toString();
        }
        return classe;
    }
    
    @Override
    public String toString()
    {
        return classe;
    }
}