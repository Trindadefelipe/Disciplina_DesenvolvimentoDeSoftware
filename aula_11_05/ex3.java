package aula_11_05;

class ContaBancaria {
    String titular;
    double saldo;
    final double TAXA_BANCARIA = 2.00;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacarDinheiro(double saque) {
        if (saque <= saldo && saldo > 2) {
            saque = saque - TAXA_BANCARIA;
            System.out.println("Saque realido! Valor do saque: R$" + saque);
        } else {
            System.out.println("Valor não disponivel na conta para saque!");

        }
    }
}

public class ex3 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Felipe Trindade", 1000);

        conta1.sacarDinheiro(200);
    }
}
