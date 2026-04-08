class Produto{
    String nome;
    Double preco = 0.0;

    public Produto(String nome, Double preco){
        this.nome = nome;
        if (preco <= 0) {
            System.out.println("Erro! Preço negativo!");
        } else {
            this.preco = preco;
        }
    }
}

public class exercicio6 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Coca-Cola 2L", 12.00);
        Produto produto2 = new Produto("Fanta 2L", -25.00);

        System.out.println("Nome do produto: " + produto1.nome);
        System.out.println("Nome do produto: " + produto1.preco);
        System.out.println("Nome do produto: " + produto2.nome);
        System.out.println("Nome do produto: " + produto2.preco);
    }
}
