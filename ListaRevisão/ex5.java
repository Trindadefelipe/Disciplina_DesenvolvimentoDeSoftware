package ListaRevisão;

class Produto{
    private String nomeProduto;
    private double precoProduto;

    public Produto (String nomeProduto, double precoProduto){
        if (precoProduto < 0 ) {
            throw new IllegalArgumentException("Valor do produto deve ser maior ou igual a 0...");
        }
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }

    public double getPrecoProduto(){
        return precoProduto;
    }

    public void aplicarDesconto(double percentual){
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Valor do percentual não pode ser menor que 0 ou maior que 100. Valor digitado " + percentual);
        }

        this.precoProduto = precoProduto - (precoProduto * percentual /100);
    }
}

public class ex5 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Abacaxi", 7.99);
        Produto produto2 = new Produto("Banana", 5.50);

        produto1.aplicarDesconto(5);

        System.out.println(produto1.getNomeProduto());
        System.out.println(produto1.getPrecoProduto());
        System.out.println("=========");
        System.out.println(produto2.getNomeProduto());
        System.out.println(produto2.getPrecoProduto());

    }
}
