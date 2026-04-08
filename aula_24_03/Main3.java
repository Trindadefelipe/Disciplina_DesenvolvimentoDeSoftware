import java.util.ArrayList;

class Produto{
    String nome;
    double valor;
}

class Pedido{
    String cliente;
    double valorTotal = 0.0;
    ArrayList<Produto> produtos =  new ArrayList<>();

    void adicionarProduto(Produto p){
        produtos.add(p);
        valorTotal += p.valor;
    };

    void listarProdutos(){
        for(Produto p: produtos){
            System.out.println(p.nome + "- R$" + p.valor);
        }
    };

    void valorPedido(){
        System.out.println("Total do pedido: R$" + valorTotal);
    }
    
}

public class Main3 {
    public static void main(String[] args) {
        System.out.println();
        
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        produto1.nome = "Lanche 1";
        produto1.valor = 19.90;
        produto2.nome = "Lanche 2";
        produto2.valor = 24.90;
        produto3.nome = "Lanche 3";
        produto3.valor = 26.90;

        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();

        pedido1.cliente = "Fernando";
        pedido2.cliente = "Felipe";

        pedido1.adicionarProduto(produto1);
        pedido1.adicionarProduto(produto2);
        pedido2.adicionarProduto(produto3);

        pedido1.listarProdutos();
        pedido1.valorPedido();
        pedido2.listarProdutos();
        pedido2.valorPedido();
    }
}
