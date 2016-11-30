/*
 * Dependendo do lado, escolhido você será do bem, ou do mal.
 */
package jogosw;

/**
 *
 * @author Mateus
 */
public class Personagem
{
    
    private final Jogador player;
    private int nivel = 1, vida = 100, ataque = 1, defesa = 1, arma = 1, escudo = 1;
    private double dinheiro = 100000.00;
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
            this.ataque = this.ataque*nivel + this.arma;
        else
            throw new IllegalArgumentException("Pare de trollar o jogo");
    }
    
    public void aumentaDefesa(int defesa, int escudo)
    {
        if(defesa >= 0 && escudo >= 0)
            this.defesa = this.defesa* nivel + this.escudo;
        else
            throw new IllegalArgumentException("Pare de trollar o jogo");
    }
    
    public void aumentaNivel()
    {
        nivel++;
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
            this.vida+= vida * nivel;
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

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getVida() {
        return vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public int getNivel() {
        return nivel;
    }

    public int getArma() {
        return arma;
    }
 
    public double getDinheiro() {
        return dinheiro;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
}