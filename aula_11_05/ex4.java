package aula_11_05;

import java.util.ArrayList;

class Produto {
    String produto;
    double preco;
    final double IMPOSTO = 0.10;

    public Produto(String produto, double preco) {
        this.produto = produto;
        this.preco = preco;
    }

    public void calcularImposto() {
        Double precoFinal = preco - (preco * IMPOSTO);
        System.out.println(precoFinal);
    }
}

public class ex4 {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Mortadela", 25));
        lista.add(new Produto("Queijo", 15));
        lista.add(new Produto("Vinho", 25));

        for (Produto p : lista) {
            System.out.print("Produto: " + p.produto + " - " + "Valor: R$");
            p.calcularImposto();
        }
    }
}
