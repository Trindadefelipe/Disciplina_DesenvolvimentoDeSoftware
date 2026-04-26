package ListaRevisão;
/*  class Aluno {
String nome;
public Aluno(String nome) {
nome = nome;
}
} */
/*O código não possui encapsulamento, e dentro do construtor ele esta sem o "this" deixando o codigo incompleto.*/

class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class ex6 {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Beatriz");
        System.out.println(aluno1.getNome());
    }
}
