public class Produto {
    String nome;
    double preco;
    int quantidade;

    void produtomercado(){
        System.out.println("Produto: " + nome);
        System.out.println("Valor do produto: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }

    public static void main(String[] args) {
        System.out.println();
        Produto produto1 = new Produto();

        produto1.nome = "Maionese Heinz";
        produto1.preco = 12.90;
        produto1.quantidade = 200;

        produto1.produtomercado();

    }
}
