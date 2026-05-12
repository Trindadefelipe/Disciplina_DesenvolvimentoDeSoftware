class Produto {
    private String nome;
    private Double preco;

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        
        if (preco > 0) {
            this.preco = preco;
            System.out.println("OK o seu Valor é maior que zero: ");
        } else {
            System.out.println("Valor zerado ou negativo, tente novamente");
        }

    }
}

public class exercicio7{
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Melancia");
        produto1.setPreco(9.50);
        System.out.println("Parabens voce comprou uma: " + produto1.getNome());
        System.out.println("Voce pagou: "+ produto1.getPreco());
    }

}
