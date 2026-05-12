import java.util.ArrayList;

class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
}

class ProdutoFisico extends Produto {
    double peso;

    public ProdutoFisico(String nome, double preco, double peso) {
       super(nome, preco);
        this.peso = peso;
    }
}

class ProdutoDigital extends Produto {
    int tamanhoArquivo;

    public ProdutoDigital(String nome, double preco, int tamanhoArquivo) {
        super(nome, preco);
        this.tamanhoArquivo = tamanhoArquivo;
    }
}

class Carrinho {
    ArrayList<Produto> produtos = new ArrayList<>();
    double precoTotal = 0;
    String nomeCliente;

    void adicionarProdutos(Produto p) {
        produtos.add(p);
        precoTotal += p.preco;
    }

    void adicionarCliente(Cliente c) {
        this.nomeCliente = c.nome;
    }

    void listarProdutos() {
        System.out.println("==== Produtos no carrinho ====");
        System.out.println("Cliente: " + nomeCliente);

        for (Produto p : produtos) {
            System.out.println(p.nome + ": R$ " + p.preco);

            if (p instanceof ProdutoDigital pd) {
                System.out.println("Tamanho do arquivo: " + pd.tamanhoArquivo + "mb");
            }

            if (p instanceof ProdutoFisico pf) {
                System.out.println("Peso do produto: " + pf.peso + "kg");
            }
        }
    }

    void calcularTotal() {
        System.out.println("Total da compra: R$ " + precoTotal);
    }
}

class Cliente {
    String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
}

public class exercicio10 {
    public static void main(String[] args) {
        ProdutoFisico p1 = new ProdutoFisico("Livro", 10.9, 0.325);
        ProdutoDigital p2 = new ProdutoDigital("E-Book", 14.5, 120);
        Cliente cliente = new Cliente("Fernando");
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProdutos(p1);
        carrinho.adicionarProdutos(p2);
        carrinho.adicionarCliente(cliente);
        carrinho.listarProdutos();
        carrinho.calcularTotal();
    }
}