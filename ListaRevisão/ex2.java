//Problema identifcado: Variavel 'nome' não está sendo utilizada, preço do produto nao esta impedindo valores negativos e codigo criado fora da classe main.

package ListaRevisão;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Valor invalido!");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

public class ex2 {
    public static void main(String[] args) {
        Produto p = new Produto("Televisão", 1500);
        System.out.println(p.getNome());
        System.out.println(p.getPreco());
    }
}
