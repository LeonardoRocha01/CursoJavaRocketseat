package ControleDeFluxo.Repetições;

import java.util.Random;

public class sistemaFor {
    static void main(String[] args) {
        boolean dormiu = false;
        for( int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println(carneirinhos + " - Carneirinhos");
            if(dormiu = new Random().nextInt(20) == carneirinhos){
                System.out.println("Dormiu...");
                break;
            }
        }
        int ovelhas = 1;
        for(; ovelhas <= 21;){
            ovelhas = ovelhas + 2;
        }
        System.out.println("\n" + ovelhas + " Ovelhas" + "\n");
        String alunos[] = {"Leo", "Saulo", "Ryan", "Dany"};
        for(String aluno : alunos){
            System.out.println(aluno);
        }
    }
}
