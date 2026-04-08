class Aluno{
    String nome;
    int idade;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}

public class aula02 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Felipe", 25);
        System.out.println(aluno1.nome);
        System.out.println(aluno1.idade);
    }
}
