class Pedido {
    int numero;
    double valor;

    public Pedido(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
    }
}

public class exercicio9 {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1, 100000);

        System.out.println("Pedido: " + pedido1.numero);
        System.out.println("Valor pedido: R$ " + pedido1.valor);
    }
}
