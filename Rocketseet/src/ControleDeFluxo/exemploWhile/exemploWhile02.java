package ControleDeFluxo.exemploWhile;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class exemploWhile02 {

    static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0){
        double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
            valorDoce = mesada;
            DecimalFormat df = new DecimalFormat("00.00");
            String formato = df.format(valorDoce);
            System.out.println("Doce do valor: " + formato + " Adicionado no carrinho");
            mesada = mesada - formato.length();
        }
        System.out.println("Mesada: " + mesada);
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(4, 10.99);
    }
    }

