package ControleDeFluxo.Excepetion;

import java.text.NumberFormat;
import java.text.ParseException;

public class exemploExcepetion {
    static void main(String[] args) {
        try {
            Number valor = Double.valueOf("a1.75");
            System.out.println(valor);
        }catch (NumberFormatException exception) {
            System.err.println("Número inválido");
        }
        try {
            Number valor2 = NumberFormat.getInstance().parse("1,75");
            Double valor3 = valor2.doubleValue();
            System.out.println("Numero Correto " + valor3);
        }catch (ParseException e){
            System.err.println("Numero Invalido");
        }
    }
}
