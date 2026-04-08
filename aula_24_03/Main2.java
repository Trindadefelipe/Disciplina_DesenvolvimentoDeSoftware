import java.util.ArrayList;

class Produto{
    String nome;
    Double preco;
}

public class Main2 {
    public static void main(String[] args) {
        System.out.println();
        ArrayList<Produto> estoque = new ArrayList<>();

        Produto produto1 = new Produto();
        produto1.nome = "Sabonete";
        produto1.preco = 2.50;

        Produto produto2 = new Produto();
        produto2.nome = "Arroz";
        produto2.preco = 23.99;

        Produto produto3 = new Produto();
        produto3.nome = "Chevete";
        produto3.preco = 1500.00;

        estoque.add(produto1);
        estoque.add(produto2);
        estoque.add(produto3);

        for(Produto a : estoque){
            System.out.println(a.nome);
            System.out.println(a.preco);
        }
    }
}
