package Operadores;

public class atribuicoes {
    public static void main(String[] args) {
      String nome = "Leo";
      int idade = 58;
      int limiteDeIdade = 18;
      boolean maiorIdade = idade >= limiteDeIdade;
      String print = nome + (maiorIdade ? " é maior" : " é  menor");
        System.out.println(print);
    }
}
