package ControleDeFluxo.Repetições;

public class condicional {
        public static void main(String[] args) {
            double valorSolicitado = 18.58;
            double saldo = 17.0;
            if (valorSolicitado <= saldo) {
                saldo = saldo - valorSolicitado;
                System.out.println("Saldo realizado " + saldo);
            }else{
                System.out.println("Saldo insuficiente, seu saldo é: " + saldo );
            }
        }
    }
