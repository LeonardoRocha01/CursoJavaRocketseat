package OrientaçãoaObjetos.aula01;

public class Cliente {
    String nome;
    Double limiteCredito = 20.0;
    public void solicitarLimiteCredito(Double valorSolicitado){
    limiteCredito = valorSolicitado;
    }
    public void comprar(Double valorProduto){
        limiteCredito = limiteCredito - valorProduto;
    }
    public Cliente(String nome) {
        this.nome = nome;
    }
}
