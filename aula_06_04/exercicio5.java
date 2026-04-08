class Funcionario{
    String nome;
    Double salario;
    Double bonus = 0.0;

    public Funcionario(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
        bonus = (salario * 0.1) + salario; 
    }
}

public class exercicio5 {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Felipe Trindade", 1000.00);
        System.out.println("Nome do Funcionario: " + func1.nome);
        System.out.println("Salario do Funcionario: R$" + func1.salario);
        System.out.println("Salario com Bonus: R$" + func1.bonus);
    }
    
}
