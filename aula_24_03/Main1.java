import java.util.ArrayList;

class Aluno {
    String nome;
    int idade;
}

public class Main1 {
    public static void main(String[] args) {
        System.out.println();
        ArrayList<Aluno> alunos = new ArrayList<>();

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Felipe Trindade";
        aluno1.idade = 25;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Daniel Trindade";
        aluno2.idade = 19;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Jonatas Trindade";
        aluno3.idade = 50;

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        for (Aluno a : alunos) {

            System.out.println(a.nome);
        }

    }
}