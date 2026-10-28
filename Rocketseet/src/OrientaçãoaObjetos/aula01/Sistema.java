package OrientaçãoaObjetos.aula01;

public class Sistema {
    static void main(String[] args) {
        Cliente leo = new Cliente("Leo");
        System.out.println("Leo começou com o limite de: " + leo.limiteCredito);
        leo.solicitarLimiteCredito(100.0);
        System.out.println("O limite solicitado é: " + leo.limiteCredito);
        leo.comprar(50.0);

        Cliente dani = new Cliente("Dani");
        System.out.println("Dani começou com o limite de: " + dani.limiteCredito);
        dani.solicitarLimiteCredito(80.0);
        System.out.println("O limite solicitado é: " + dani.limiteCredito);
    }
}
