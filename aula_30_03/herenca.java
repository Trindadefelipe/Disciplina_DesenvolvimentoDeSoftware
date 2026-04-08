class Pessoa{
    String nome;
    int idade;
}
class Aluno extends Pessoa{
    String curso;
}
class Professor extends Pessoa{
    String disciplina;
}
public class herenca {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ana";
        aluno1.idade = 20;
        aluno1.curso = "ADS";

        Professor professor1 = new Professor();
        professor1.nome = "Duda";
        professor1.idade = 30;
        professor1.disciplina = "Desenvolvimento de Software";

        System.out.println(aluno1.nome);
        System.out.println(aluno1.idade);
        System.out.println(aluno1.curso);
        System.out.println(professor1.nome);
        System.out.println(professor1.idade);
        System.out.println(professor1.disciplina);
    }
}
