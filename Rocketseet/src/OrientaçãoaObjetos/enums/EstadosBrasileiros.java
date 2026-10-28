package OrientaçãoaObjetos.enums;

public enum EstadosBrasileiros {
    PI ("Piaui", "PI"),
    MA ("Maranhão", "MA"),
    SP ("São Paulo", "SP"),
    RJ ("Rio de Janeiro", "RJ");

    private String nome;
    private String sigla;
    private EstadosBrasileiros(String nome,  String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
}
