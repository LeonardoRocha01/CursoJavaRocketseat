package Operadores.javaBeans;

public class aluno {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        nome = newNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int newIdade) {
        if (newIdade < 18) {
throw new IllegalArgumentException("idade invalida");
        }
        idade = newIdade;
    }
}