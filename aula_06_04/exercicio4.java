class ContaBancaria{
    String titular;
    Double saldo = 0d;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
}

public class exercicio4 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Felipe Trindade", 100.000);
        System.out.println(conta1.titular);
        System.out.println(conta1.saldo);
    }
}
