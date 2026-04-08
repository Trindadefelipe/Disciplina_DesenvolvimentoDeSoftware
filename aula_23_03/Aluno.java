class aluno {
    String nome;
    int idade;
    String curso;
    String cpf;
    
    void apresentar(){ // metodo
        System.out.println("Meu nome é "+ nome);
        System.out.println("Tenho "+ idade + " anos");
        System.out.println("Curso "+ curso);
        System.out.println("CPF:  "+ cpf);
    }

    void estudar(){
        System.out.println("O aluno(a) " + nome + " está estudando!");
    }

    public static void main(String[] args) {
        System.out.println();
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Felipe Trindade";
        aluno1.idade = 25;
        aluno1.curso = "Analise e Desenvolvimento de Sistemas";
        aluno1.cpf = "12345678950";

        aluno1.apresentar();
        aluno1.estudar();
    }
}
