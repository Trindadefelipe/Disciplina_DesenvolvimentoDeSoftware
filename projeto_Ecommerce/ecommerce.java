import java.util.ArrayList;

class Produto {
    String nomeProduto;
    Double valorProduto;

    public Produto(String nomeProduto, Double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }
}

class ProdutoFisico extends Produto {
    Double peso;

    public ProdutoFisico(String nomeProduto, Double valorProduto, Double peso) {
        super(nomeProduto, valorProduto);
        this.peso = peso;
    }
}

class ProdutoDigital extends Produto {
    Double tamanhoArquivo;

    public ProdutoDigital(String nomeProduto, Double valorProduto, Double tamanhoArquivo) {
        super(nomeProduto, valorProduto);
        this.tamanhoArquivo = tamanhoArquivo;
    }
}

class Cliente {
    String nome;

}

class Carrinho {
    ArrayList<Produto> carrinho = new ArrayList<>();
    Double valorTotal = 0.0;

    void adicionarProduto(Produto p) {
        carrinho.add(p);
    }

    void listarProdutos() {
        for (Produto produto : carrinho) {
            System.out.println("======Listagem de Produtos do Carrinho====");
            System.out.println("Produto: " + produto.nomeProduto);
            System.out.println("Valor: R$" + produto.valorProduto);

            if (produto instanceof ProdutoDigital pd) {
                System.out.println("Tamanho do arquivo: " + pd.tamanhoArquivo + "MB");
            }

            if (produto instanceof ProdutoFisico pf) {
                System.out.println("Peso do produto: " + pf.peso + "Kg");
            }
        }
    }

    void calcularTotal() {
        for (Produto produto : carrinho) {
            valorTotal += produto.valorProduto;
        }
        System.out.println("=====Total do Carrinho=====");
        System.out.println("Valor total do carrinho: R$" + valorTotal);
    }
}

public class ecommerce {
    public static void main(String[] args) {
        System.out.println();

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        ProdutoFisico produtofisico1 = new ProdutoFisico();
        ProdutoDigital produtodigital1 = new ProdutoDigital();

        produtofisico1.nomeProduto = "Televisão";
        produtofisico1.valorProduto = 1500.00;
        produtofisico1.peso = 25.0;

        produtodigital1.nomeProduto = "GTA 6";
        produtodigital1.valorProduto = 500.00;
        produtodigital1.tamanhoArquivo = 1000000.00;

        produto1.nomeProduto = "Banana";
        produto1.valorProduto = 9.50;
        produto2.nomeProduto = "Alface";
        produto2.valorProduto = 4.50;
        produto3.nomeProduto = "Abacaxi";
        produto3.valorProduto = 7.95;

        Carrinho carrinho1 = new Carrinho();
        Carrinho carrinho2 = new Carrinho();
        Carrinho carrinho3 = new Carrinho();

        // adicionando produtos carrinho 1
        carrinho1.adicionarProduto(produto1);
        carrinho1.adicionarProduto(produto2);
        carrinho1.adicionarProduto(produto3);
        carrinho1.adicionarProduto(produto3);

        // adicionando produtos carrinho 2
        carrinho2.adicionarProduto(produto2);
        carrinho2.adicionarProduto(produto3);

        // adicionando produtos carrinho 3
        carrinho3.adicionarProduto(produtofisico1);
        carrinho3.adicionarProduto(produtodigital1);

        carrinho1.listarProdutos();
        carrinho2.listarProdutos();
        carrinho3.listarProdutos();

        carrinho1.calcularTotal();
        carrinho2.calcularTotal();
        carrinho3.calcularTotal();
    }

}
