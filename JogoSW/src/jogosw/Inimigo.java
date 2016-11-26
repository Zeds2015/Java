/*
 * Aqui serão gerados os inimigos, sim gerados, eles não tem nenhuma relação com o personagem.
 */
package jogosw;

import java.util.Random;

/**
 *
 * @author Mateus
 */
public class Inimigo implements verPontos
{
    private int ataque = 0, defesa = 0, vida = 0, escudo = 0, arma = 0, nivel = 0;
    
    
        Inimigo()
        {
            Random gerador = new Random();
            ataque = (int) gerador.nextGaussian() * 100000;
            defesa = (int) gerador.nextGaussian() * 100000;
            vida = (int) gerador.nextGaussian() * 100000;
            escudo = (int) gerador.nextGaussian() * 100000;
            arma = (int) gerador.nextGaussian() * 100000;
            nivel = (int) gerador.nextGaussian() * 100000;
        }
        
    public void perdeVida(int vida)
    {
        if(vida > 0)
            this.vida-= vida;
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
