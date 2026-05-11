import java.util.ArrayList;

abstract class Funcionario{
    protected double salario;

    public Funcionario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public abstract double calcularSalario();
}

class Gerente extends Funcionario {
    public Gerente(double salario){
        super(salario);
    }

    @Override
    public double calcularSalario(){
        return salario + 1000;
    }
}

class Desenvolvedor extends Funcionario {
    public Desenvolvedor(double salario){
        super(salario);
    }

    @Override
    public double calcularSalario(){
        return salario + 500;
    }
}

class Estagiario extends Funcionario {
    public Estagiario(double salario){
        super(salario);
    }

    public double calcularSalario(){
        return salario;
    }
}



public class ex3 {
    public static void main(String[] args) {
        ArrayList <Funcionario> lista = new ArrayList<>();

        lista.add(new Gerente(8000));
        lista.add(new Desenvolvedor(4500));
        lista.add(new Estagiario(800));

        for(Funcionario f : lista){
            System.out.println(f.calcularSalario());
        }
    }
}
