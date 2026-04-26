package ListaRevisão;

class Aluno {
    String nome;
    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("nota invalida! Valor não adicionado");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}

public class ex3 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Daniel", 7.5);

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getNota());
    }
}
