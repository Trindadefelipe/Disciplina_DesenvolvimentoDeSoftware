import java.util.Scanner;
import java.util.ArrayList;

class ContaBancaria {
    private String titular;
    private Double saldo;

    public ContaBancaria(String titular, Double saldo) {
        this.titular = titular;
        setSaldo(saldo);
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(Double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido! Valor negativo!");
        }
    }
}

public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        System.out.println("Digite o nome do titular da conta: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o saldo da conta: ");
        Double saldo = entrada.nextDouble();

        ContaBancaria conta1 = new ContaBancaria(nome, saldo);

        if (conta1.getSaldo() != null) {
            contas.add(conta1);
            System.out.println("Conta adicionada com sucesso!");
        } else {
            System.out.println("Conta não adicionada...");
        }
        entrada.close();
    }
}