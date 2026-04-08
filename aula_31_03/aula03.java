class Carro {
    String marca;
    String modelo;

    public Carro() {}

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}

public class aula03 {
    public static void main(String[] args) {
        Carro veiculo1 = new Carro("Hyundai", "HB20s");
        System.out.println("Marca: " + veiculo1.marca);
        System.out.println("Modelo: " + veiculo1.modelo);
    }
}
