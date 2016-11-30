/*
 * Aqui serão gerados os inimigos, sim gerados, eles não tem nenhuma relação com o personagem.
 */
package jogosw;

/**
 *
 * @author Mateus
 */
public class Inimigo
{
    private int ataque = 0, defesa = 0, vida = 0, escudo = 0, arma = 0, nivel = 0;
        
    public void perdeVida(int vida)
    {
        if(vida > 0)
            this.vida = this.vida - vida;
        else
            throw new IllegalArgumentException("Pare de trollar o jogo");
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }
    
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getEscudo() {
        return escudo;
    }
    
    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }
    
    public int getArma() {
        return arma;
    }

    public void setArma(int arma) {
        this.arma = arma;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
     public void diminuiDefesa(int defesa)
    {
        if(defesa > 0)
            this.defesa-= defesa;
        else
            throw new IllegalArgumentException("Pare de trollar o jogo");
    }
}
