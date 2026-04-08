class Aluno {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
        ;
    }
}

public class exercicio2 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        aluno1.setNome("Felipe Trindade");
        aluno1.setIdade(25);

        aluno2.setNome("Daniel Trindade");
        aluno2.setIdade(-20);  //adicionando idade invalida
    }

}
