/*
*class ContaBancaria {
*private double saldo;
*public void setSaldo(double saldo) {
*this.saldo = saldo;
*}
*}
*Problema identificado: O código está errado por que viola a regra de negócio, o fato de *ter a opção de poder alterar o valor quebra o fato de se tratar de uma Conta Bancaria. *Onde qualquer usuário pode adicionar o valor que bem entender utilizando o método set sem *uma validação lógica.
*/

package ListaRevisão;

class ContaBancaria {
    private double saldo;

    public ContaBancaria (double saldo){
        setSaldo(saldo);
    }

    public double getSaldo(){
        return saldo;
    }

    public final void setSaldo(double saldo){
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Valor inválido! Não adicionado...");
        }
    }
}

public class ex4 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(250);
        System.out.println(conta1.getSaldo());
        conta1.setSaldo(-500);
        System.out.println(conta1.getSaldo());
    }
}
