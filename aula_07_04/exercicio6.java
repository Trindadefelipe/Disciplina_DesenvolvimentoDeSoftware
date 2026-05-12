class Funcionario {
    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario * 1.10;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

}
public class exercicio6{
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Higor", 1000.0 );
        System.out.println("Funcionario: "+ funcionario1.getNome());
        System.out.println("Salario do funcionario: " + funcionario1.getSalario());
    }
}
