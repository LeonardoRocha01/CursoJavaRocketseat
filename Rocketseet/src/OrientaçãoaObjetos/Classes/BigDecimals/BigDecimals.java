package OrientaçãoaObjetos.Classes.BigDecimals;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimals {
    public static void main(String[] args) {
        /*
        BigDecimal dois = BigDecimal.TWO;
        BigDecimal resultado = dois.add(new BigDecimal("15"));
        resultado = resultado.multiply(new BigDecimal("5.4"));
        System.out.println(resultado);
        */

        BigDecimal divisor = BigDecimal.valueOf(3);
        BigDecimal resultado = BigDecimal.TEN.divide(divisor,3, RoundingMode.HALF_EVEN);
        System.out.println(resultado);
    }
}
