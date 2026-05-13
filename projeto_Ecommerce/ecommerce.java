import java.util.ArrayList;
import java.util.Scanner;

abstract class Produto {
    protected String nomeProduto; // Encapsulando, necessitando utilizar get e set
    protected double valorProduto;
    protected double valorLiquido = 0.0;
    double percentual = 0.10;

    public Produto(String nomeProduto, double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setValorProduto(double valorProduto) {
        if (valorProduto >= 0) {
            this.valorProduto = valorProduto;
        } else {
            System.out.println("Valor de produto inválido!!");
        }
    }

    void aplicarDesconto(double percentual) {
        valorLiquido = valorProduto - (valorProduto * percentual / 100);
        this.valorProduto = valorLiquido;
    }

    abstract public double calcularPrecoFinal();
}

class ProdutoFisico extends Produto {
    private double peso;
    private double frete;

    public ProdutoFisico(String nomeProduto, double valorProduto, double peso) {
        super(nomeProduto, valorProduto);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        } else {
            System.out.println("Peso de produto inválido!");
        }
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = 50;
    }

    @Override
    public double calcularPrecoFinal() {
        return valorProduto + frete;
    }

}

class ProdutoDigital extends Produto {
    private double tamanhoArquivo;

    public ProdutoDigital(String nomeProduto, double valorProduto, double tamanhoArquivo) {
        super(nomeProduto, valorProduto);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        if (tamanhoArquivo >= 0) {
            this.tamanhoArquivo = tamanhoArquivo;
        } else {
            System.out.println("Tamanho do arquivo inválido!");
        }
    }

    @Override
    public double calcularPrecoFinal() {
        return valorProduto;
    }
}

class Cliente {
    private String nomeCliente;

    // construtor
    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

}

class Carrinho {
    private ArrayList<Produto> produtos;

    // Construtor
    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    // criando get para retornar lista de produtos
    public ArrayList<Produto> getProdutosCarrinho() {
        return this.produtos;
    }

    // Método para adicionar um produto no carrinho
    void adicionarProduto(Produto p) {
        if (p.getValorProduto() > 0) {
            this.produtos.add(p);
            System.out.println(p.getNomeProduto() + " adicionado no carrinho!");
        } else {
            System.out.println("Valor de produto inválido! Não foi adicionado ao carrinho!");
        }
    }

    // Método para remover um produto do carrinho
    void removerProduto(Produto p) {
        if (!this.produtos.remove(p)) {
            System.out.println("Produto não encontrado no carrinho!");
        }
    }

    // Método mostrar/listar produtos
    void listarProdutos() {

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto no carrinho!");
        } else {
            System.out.println("======Listagem de Produtos do Carrinho====");
            for (Produto p : produtos) {
                System.out.println("-------------------------");
                System.out.println("Produto: " + p.getNomeProduto());
                System.out.println("Valor: R$" + p.calcularPrecoFinal());

                // utilização de instanceof para confirmar o tipo do objeto
                if (p instanceof ProdutoDigital pd) {
                    System.out.println("Tamanho do arquivo: " + pd.getTamanhoArquivo() + "MB");
                }

                if (p instanceof ProdutoFisico pf) {
                    System.out.println("Peso do produto: " + pf.getPeso() + "Kg");
                }
            }
        }
    }

    // Método calcular total de produto do carrinho
    double calcularTotal() {
        double valorTotal = 0.0;
        for (Produto p : produtos) {
            valorTotal += p.calcularPrecoFinal();
        }
        System.out.println("===Total do Carrinho===");
        System.out.println("Valor total do carrinho: R$" + valorTotal);
        return valorTotal;
    }
}

class Pedido {
    private Cliente cliente;
    private Carrinho carrinho;

    // construtor
    public Pedido(Cliente cliente, Carrinho carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    public Cliente getClientePedido() {
        return this.cliente;
    }

    public Carrinho getCarrinhoCliente() {
        return this.carrinho;
    }

    // Método mostrar resumo
    void mostrarResumo() {
        System.out.println();
        System.out.println("===Encerrando===");
        System.out.println("Obrigado por comprar! Seu resumo do pedido:");
        System.out.println("Cliente: " + this.cliente.getNomeCliente());
        this.carrinho.listarProdutos();
        this.carrinho.calcularTotal();
    }
}

public class ecommerce {
    public static void main(String[] args) {
        System.out.println();

        Scanner entrada = new Scanner(System.in);

        // Criação de produtos físicos
        Produto produtoFisico1 = new ProdutoFisico("Televisão 50 polegadas", 1599.99, 12);
        Produto produtoFisico2 = new ProdutoFisico("Monitor 24 polegadas 144hz Gamer", 630.99, 4);

        // Criação de produtos Digitais
        Produto produtoDigital1 = new ProdutoDigital("GTA 6", 899.99, 1000000);
        Produto produtoDigital2 = new ProdutoDigital("Call Of Dutty Warzone", 150.50, 100);

        // Aplicando desconto em um produto
        produtoDigital2.aplicarDesconto(100);
        produtoFisico2.aplicarDesconto(10);

        System.out.print("Digite seu nome: ");
        String nomeDigitado = entrada.nextLine();
        Cliente cliente1 = new Cliente(nomeDigitado);
        // Criando carrinho do cliente
        Carrinho carrinho1 = new Carrinho();

        // Menu de exibição
        System.out.println("Bem vindo, " + cliente1.getNomeCliente() + "!");
        System.out.println("==== Ecommerce - Felipe Trindade ====");
        int opcao;
        do {
            System.out.println(
                    "Escolha o produtos desejado:\n1 - Televisão 50' - R$1.500,00 \n2 - Monitor 24' 144hz Gamer - R$630,99 \n3 - GTA 6 - R$899,99 \n4 - Call Of Dutty Warzone - R$150,50 \n9 - Finalizar compra \n0 - Sair");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    carrinho1.adicionarProduto(produtoFisico1);
                    break;
                case 2:
                    carrinho1.adicionarProduto(produtoFisico2);
                    break;
                case 3:
                    carrinho1.adicionarProduto(produtoDigital1);
                    break;
                case 4:
                    carrinho1.adicionarProduto(produtoDigital2);
                    break;
                case 8:
                    Pedido pedido1 = new Pedido(cliente1, carrinho1);
                    pedido1.mostrarResumo();
                    break;
                case 9:
                    pedido1.calcularTotal();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0 && opcao != 7);

        entrada.close();
    }
}
