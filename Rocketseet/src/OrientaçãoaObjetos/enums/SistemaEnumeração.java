package OrientaçãoaObjetos.enums;

public class SistemaEnumeração {
    static void main(String[] args) {
        System.out.println("Estados Localizados");
        for (EstadosBrasileiros eb : EstadosBrasileiros.values()) {
            System.out.println(eb.getNome() + " - " + eb.getSigla());
        }
    }
}