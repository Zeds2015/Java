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
public final class Mochila {
    
    private static int armaAtaque1 = 0, armaAtaque2 = 0,
        armaAtaque3 = 0, escudoDefesa1 = 0,
        escudoDefesa2 = 0,escudoDefesa3 = 0;

    public static int getArmaAtaque1() {
        return armaAtaque1;
    }
    public static void setArmaAtaque1(int aArmaAtaque1) {
        armaAtaque1+= aArmaAtaque1;
    }
    public static int getArmaAtaque2() {
        return armaAtaque2;
    }
    public static void setArmaAtaque2(int aArmaAtaque2) {
        armaAtaque2+= aArmaAtaque2;
    }
    public static int getArmaAtaque3() {
        return armaAtaque3;
    }
    public static void setArmaAtaque3(int aArmaAtaque3) {
        armaAtaque3+= aArmaAtaque3;
    }
    public static int getEscudoDefesa1() {
        return escudoDefesa1;
    }
    public static void setEscudoDefesa1(int aEscudoDefesa1) {
        escudoDefesa1+= aEscudoDefesa1;
    }
    public static int getEscudoDefesa2() {
        return escudoDefesa2;
    }
    public static void setEscudoDefesa2(int aEscudoDefesa2) {
        escudoDefesa2+= aEscudoDefesa2;
    }
    public static int getEscudoDefesa3() {
        return escudoDefesa3;
    }
    public static void setEscudoDefesa3(int aEscudoDefesa3) {
        escudoDefesa3+= aEscudoDefesa3;
    }
    
    @Override
    public String toString()
    {
        return "\nItens \n"+ "\nArma Nivel 1: " + armaAtaque1 + "\nArma Nivel 2: " + armaAtaque2 +
               "\nArma Nivel 3: " + armaAtaque3 + "\nEscudo Nivel 1: " + escudoDefesa1 + "\nEscudo Nivel Médio: " + escudoDefesa2 +
               "\nEscudo Nivel Forte: " + escudoDefesa3;  
    }
}
