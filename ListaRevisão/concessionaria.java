import java.util.ArrayList;

class Cliente {
    // encapsulamento
    private String nomeCliente;
    private String cpf;

    // construtor
    public Cliente(String nomeCliente, String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            throw new IllegalArgumentException(
                    "Valor de CPF não pode ser menor que 11 digitos! Valor digitado: " + cpf);
        }

        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
    }

    // getters
    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }
}

class Carro {
    // escapsulamento
    private String marcaVeiculo;
    private String modeloVeiculo;
    private double precoVeiculo;

    // construtor
    public Carro(String marcaVeiculo, String modeloVeiculo, double precoVeiculo) {
        if (precoVeiculo <= 0) {
            throw new IllegalArgumentException(
                    "Valor do veículo não pode ser negativo! Valor digitado: " + precoVeiculo);
        }

        this.marcaVeiculo = marcaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.precoVeiculo = precoVeiculo;
    }

    // getters
    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public double getPrecoVeiculo() {
        return precoVeiculo;
    }
}

class Estoque {
    ArrayList<Carro> estoque = new ArrayList<>();

    void adicionarCarro(Carro c) {
        estoque.add(c);
    }

    void listarCarros() {
        System.out.println("===ESTOQUE===");
        for (Carro carro : estoque) {
            System.out.print(carro.getMarcaVeiculo() + " ");
            System.out.print(carro.getModeloVeiculo());
            System.out.print(" - R$");
            System.out.print(carro.getPrecoVeiculo());
            System.out.println();
        }
    }

    void calcularValorTotalEstoque() {
        double totalEstoque = 0;

        for (Carro carro : estoque) {
            totalEstoque += carro.getPrecoVeiculo();
        }

        System.out.println("Valor total do estoque: " + totalEstoque);
    }
}

class Venda {
    private Cliente cliente;
    private Carro carro;

    public Venda(Cliente cliente, Carro carro) {
        this.cliente = cliente;
        this.carro = carro;
    }

    void mostrarResumoVenda() {
        System.out.println("===VENDA===");
        System.out.println("Cliente: " + cliente.getNomeCliente());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Carro: " + carro.getMarcaVeiculo() + " " + carro.getModeloVeiculo());
        System.out.println("Preço: R$" + carro.getPrecoVeiculo());
    }
}

public class concessionaria {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Felipe Trindade", "10521471940");

        Carro carro1 = new Carro("Honda", "Civic", 170000);
        Carro carro2 = new Carro("Chevrolet", "Cruze", 100000);
        Carro carro3 = new Carro("Fiat", "Mobi", 78000);

        Estoque estoque = new Estoque();

        estoque.adicionarCarro(carro1);
        estoque.adicionarCarro(carro2);
        estoque.adicionarCarro(carro3);

        estoque.listarCarros();

        estoque.calcularValorTotalEstoque();

        Venda venda1 = new Venda(cliente1, carro1);

        venda1.mostrarResumoVenda();
    }

}
