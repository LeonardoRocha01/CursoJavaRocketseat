package OrientaçãoaObjetos.Classes;

import java.util.Scanner;

public class Scanners {
    static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String nome = sc.next();

            System.out.println("Digite sua idade: ");
            Integer idade = sc.nextInt();

            System.out.println("Digite seu peso: ");
            Double peso = sc.nextDouble();

            System.out.println("Digite sua altura: ");
            Double altura = sc.nextDouble();
            sc.close();

        }catch (Exception e){
            System.err.println("Erro no formato de digitação.");
        }
    }
}