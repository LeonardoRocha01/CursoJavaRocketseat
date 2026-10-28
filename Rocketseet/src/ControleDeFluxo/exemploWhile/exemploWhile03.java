package ControleDeFluxo.exemploWhile;

import java.util.Random;

public class exemploWhile03 {
    private static int numeroDeTentativas = 0;
    static void main(String[] args) {
        System.out.println("Discando...");
        do {
            System.out.println("Telefone tocando...");
        }while (tocando());
        if(numeroDeTentativas < 5)
        System.out.println("Alô");
        else
            System.out.println("Não atendeu");
    }
    private static boolean tocando(){
        numeroDeTentativas++;
        boolean atendeu = new Random().nextInt(5)==1;
        if (numeroDeTentativas == 5)
            return false;
        else
            return !atendeu;
    }
}
