class Pessoa{
    String nome;
    int idade;
}
class Funcionario extends Pessoa{
    double salario;
}

public class empresa {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Maria Eduarda";
        funcionario1.idade = 30;
        funcionario1.salario = 3750.95;

        System.out.println(funcionario1.nome);
        System.out.println(funcionario1.idade);
        System.out.println(funcionario1.salario);
    }
}
