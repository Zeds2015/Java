/*
 * Dependendo do lado, escolhido você será do bem, ou do mal.
 */
package jogosw;

/**
 *
 * @author Mateus
 */
public class Personagem implements verPontos{
    
    private final Jogador player;
    private int nivel = 1, vida = 100, ataque = 1, defesa = 1, arma = 1, escudo = 1;
    private double dinheiro = 100.00;
    private static String nomePersonagem;
    
    Personagem(Jogador jogador)
    {
        player = jogador;
    }
    
    public void colocarNome(String nome)
    {
        nomePersonagem = nome;
    }
    
   @Override
    public String toString()
    {
        return nomePersonagem;
    }

    public void aumentaAtaque(int ataque, int arma)
    {
        if(arma >= 0 && ataque >= 0)
            this.ataque+= this.arma + (this.ataque*nivel);
        else
            throw new IllegalArgumentException("Pare de trollar o jogo");
    }
    
    public void aumentaDefesa(int defesa, int escudo)
    {
        if(defesa >= 0 && escudo >= 0)
            this.defesa+= this.escudo + (this.defesa*nivel);
        else
            throw new IllegalArgumentException("Pare de trollar o jogo");
    }
    
    public void aumentaNivel(int nivel)
    {
        if(nivel > 0)
            this.nivel+= nivel;
        else
            throw new IllegalArgumentException("Pare de trollar o jogo");
    }
    
    
    public void diminuiAtaque(int ataque)
    {
        if(ataque > 0)
            this.ataque-= ataque;
        else
            throw new IllegalArgumentException("Pare de trollar o jogo");
    }
    
    public void diminuiDefesa(int defesa)
    {
        if(defesa > 0)
            this.defesa-= defesa;
        else
            throw new IllegalArgumentException("Pare de trollar o jogo");
    }
    
    public void aumentaVida(int vida)
    {
        if(vida > 0)
            this.vida+= vida;
        else
            throw new IllegalArgumentException("Pare de trollar o jogo");
    }
    
    public void recebeDinheiro(double dinheiro)
    {
        if(dinheiro > 0.00)
        this.dinheiro+= dinheiro;
        else
            throw new IllegalArgumentException("Pare de trollar o jogo");
    }
    
    public void perdeVida(int vida)
    {
        if(vida > 0)
            this.vida-= vida;
        else
            throw new IllegalArgumentException("Pare de trollar o jogo");
    }
    
    public void gastaDinheiro(double dinheiro)
    {
        if(dinheiro > 0.00)
        this.dinheiro-= dinheiro;
        else
            throw new IllegalArgumentException("Pare de trollar o jogo");
    }

    @Override
    public int retornaDefesa() {
        return defesa;
    }

    @Override
    public int retornaAtaque() {
        return ataque;
    }

    @Override
    public int retornaVida() {
        return vida;
    }
}