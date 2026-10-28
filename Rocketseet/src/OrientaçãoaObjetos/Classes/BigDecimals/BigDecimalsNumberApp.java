package OrientaçãoaObjetos.Classes.BigDecimals;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalsNumberApp {
    static void main(String[] args) {
        BigDecimal preçoLitros = BigDecimal.valueOf(5.799);
        BigDecimal litrosUtilizados = BigDecimal.valueOf(21.752);
        BigDecimal valorPagar = litrosUtilizados.multiply(preçoLitros);
        BigDecimal resultado = valorPagar.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("R$ " + resultado);
    }
}
