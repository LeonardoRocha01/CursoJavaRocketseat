package ControleDeFluxo.Excepetion;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class exemploExeception02 {
    static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Olá, me chamo " + nome.toUpperCase() +  "\nTenho " + idade + " anos " + "\nA minha altura é " + altura + "cm");
        } catch (InputMismatchException exception) {
            System.err.println("Formato Invalido");
        }
    }
}
