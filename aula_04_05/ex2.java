class Funcionario {
    String nome;
    double salario;

    public void calcularSalario() {
        salario = salario + 500;
    }
}

class Gerente extends Funcionario {
    double bonus = 10;
    @Override
    public void calcularSalario(){
        System.out.println("Salario gerente: R$" + (salario + (salario * bonus / 100)));
    }
}

class Estagiario extends Funcionario {
    @Override
    public void calcularSalario(){
        System.out.println("Salario estagiário: R$" + salario / 2);
    }
}

public class ex2 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Gerente();
        Funcionario funcionario2 = new Estagiario();

        funcionario1.salario = 5000;
        funcionario2.salario = 1200;

        funcionario1.calcularSalario();
        funcionario2.calcularSalario();

    }
}
