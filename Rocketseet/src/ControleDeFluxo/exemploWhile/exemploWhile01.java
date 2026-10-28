package ControleDeFluxo.exemploWhile;

import java.util.Random;

public class exemploWhile01 {
     static void main(String[] args) {
         boolean acordado = true;
         int carneirinhos = 0;
         while (acordado) {
             System.out.println("Contando carneirinhos " + (++carneirinhos));
             acordado = !(new Random().nextInt(20) == (carneirinhos));
             if (carneirinhos == 20) {
                 carneirinhos = 0;
                 break;
             }
         }

         System.out.println("Dormiu...");
     }
    }

