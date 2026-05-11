abstract class Veiculo{
    public abstract double calcularAluguel(int dias);
}

class Carro extends Veiculo{
    @Override
    public double calcularAluguel(int dias){
        double aluguel = 0;
        return aluguel = dias * 100;
    }
}

class Moto extends Veiculo{
    @Override
    public double calcularAluguel(int dias){
        double aluguel = 0;
        return aluguel = dias * 50;
    }

}

class Caminhao extends Veiculo{
    @Override
    public double calcularAluguel(int dias){
        double aluguel = 0;
        return aluguel = 150 * dias;
    }
}

public class ex6 {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro();
        Veiculo veiculo2 = new Moto();
        Veiculo veiculo3 = new Caminhao();

        System.out.println(veiculo1.calcularAluguel(5));
        System.out.println(veiculo2.calcularAluguel(15));
        System.out.println(veiculo3.calcularAluguel(7));
    }
}
