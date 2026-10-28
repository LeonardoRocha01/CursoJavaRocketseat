package Operadores;

/**
 * Calculadora Simples
 * @author Leo
 */
public class calculadora {
    /**
     * Realiza a divisão entre dois números inteiros
     * @param dividendo     Número que será dividido
     * @param divisor       Número que irá dividir o dividendo
     * @return              O resultado da divisão entre o dividendo e o divisor
     * @author              Leo
     * @exception 	        java.lang.ArithmeticException em caso de passar o divisor igual a zero 0.
     */

    double dividir(double dividendo, double divisor){
        return dividendo / divisor;
    }
}