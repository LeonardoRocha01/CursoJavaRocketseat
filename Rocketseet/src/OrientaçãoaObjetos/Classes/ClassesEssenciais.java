package OrientaçãoaObjetos.Classes;

import java.util.Scanner;

public class ClassesEssenciais {
    static void main(String[] args) {
        String nome = null;
        Integer idade = null;
        Double peso = null;

        String stringLinhaArquivo = "Leo;19;75.90";
        Scanner scan = new Scanner(stringLinhaArquivo);
        scan.useDelimiter(";");
        int index = 0;
        while (scan.hasNext()){
            if (index == 0) {
                nome = scan.next();
            }else if (index == 1){
                idade = Integer.valueOf(scan.next());
            }else{
                peso = Double.valueOf(scan.next());
            }
            index++;
    }
        System.out.println("Seu nome: " +  nome + "\nidade: "
        + idade + "\npeso: " + peso);
    }
}
