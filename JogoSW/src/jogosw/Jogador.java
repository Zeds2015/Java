/*
 *Aqui o jogador preenche os dados dele, não será necessario o mesmo por o nome.
 */
package jogosw;

/**
 *
 * @author Mateus
 */
public class Jogador {
   
    private final String nick;
    private final int idade;
    private final String sexo;
    
    Jogador(String nick, int idade, int sexo)
    {
        this.nick = nick;
        
        if(idade > 3)
        {
        this.idade = idade;
        }
        else{
            throw new IllegalArgumentException("Idade inválida");
        }
        
        if (sexo == 1)
            this.sexo = "Masculino";
        else
            this.sexo = "Feminino";            
    }
    
    @Override
    public String toString()
    {
        return nick;
    }
}
