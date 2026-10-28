package OrientaçãoaObjetos.Classes;

public class Printformat {
    static void main(String[] args) {
        String nome = "Leo";
        int idade = 19;
        double peso = 70.58;
        double renda = 1800;
        long numero = 11993713099L;

        System.out.printf("Nome: %s \nIdade: %d \nPeso: %.2f \nRenda: R$ %,.3f%n", nome, idade, peso, renda);
        /*
        %s: parametro do tipo String
        %d: parametro do tipo Integer / Long
        %f: parametro do tipo Double / Float
        .2: quer dizer que serão dois digitos decimais
        ,.2: quer dizer que serão dois digitos decimais e informado o (.)
         */
    }
}
