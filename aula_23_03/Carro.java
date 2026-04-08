public class Carro {

    String marca;
    String modelo;
    Double velocidade;

    void acelerar(){
        System.out.println("O carro está acelerando!");
    }

    public static void main(String[] args) {
        System.out.println();
        Carro carro1 = new Carro();

        carro1.acelerar();
    }
}