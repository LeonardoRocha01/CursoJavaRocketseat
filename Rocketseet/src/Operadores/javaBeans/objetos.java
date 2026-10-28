package Operadores.javaBeans;

public class objetos {
    static void main(String[] args) {
        aluno Leo = new aluno();
        Leo.setNome("Leo");
        Leo.setIdade(15);
        System.out.println(Leo.getNome() + " " + Leo.getIdade());

    }
}
