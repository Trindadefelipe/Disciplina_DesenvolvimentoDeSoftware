class Veiculo{
    String marca;
    String modelo;
}
class Carro extends Veiculo{
    int portas;
}
class Moto extends Veiculo{
    int cilindradas;
}
public class veiculo {
    public static void main(String[] args) {
        System.out.println();
        Carro carro1 = new Carro();
        Moto moto1 = new Moto();

        carro1.marca = "Hyundai";
        carro1.modelo = "HB20 Sedan";
        carro1.portas = 4;

        moto1.marca = "Yamaha";
        moto1.modelo = "MT-07";
        moto1.cilindradas = 700;

        System.out.println("Marca do Carro: " + carro1.marca);
        System.out.println("Modelo do Carro: " + carro1.modelo);
        System.out.println("Quantidade de portas do Carro: " + carro1.portas);
        System.out.println("=========");
        System.out.println("Marca da Moto: " + moto1.marca);
        System.out.println("Marca da Moto: " + moto1.modelo);
        System.out.println("Marca da Moto: " + moto1.cilindradas + "cc");
    }
}
