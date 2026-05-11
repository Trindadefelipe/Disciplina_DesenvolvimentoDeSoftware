import java.util.ArrayList;

abstract class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularPreco();
}

class ProdutoFisico extends Produto {
    private double frete;

    public ProdutoFisico(String nome, double preco, double frete) {
        super(nome, preco);
        this.frete = frete;
    }

    @Override
    public double calcularPreco() {
        return preco + frete;
    }
}

class ProdutoDigital extends Produto {
    public ProdutoDigital(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPreco() {
        return preco;
    }
}

public class ex1 {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();

        lista.add(new ProdutoFisico("Notebook", 3000, 50));
        lista.add(new ProdutoDigital("Curso Java", 200));

        for (Produto p : lista) {
            System.out.println(p.getNome() + " - R$ " + p.calcularPreco());
        }
    }
}
