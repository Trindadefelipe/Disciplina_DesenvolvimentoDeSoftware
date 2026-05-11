import java.util.ArrayList;

abstract class Veiculo{
    protected int dias;

    public Veiculo(int dias){
        this.dias = dias;
    }

    public int getDias(){
        return dias;
    }

    public abstract double calcularAluguel();
}

class Carro extends Veiculo{
    public Carro(int dias){
        super(dias);
    }

    @Override
    public double calcularAluguel(){
        double aluguel = 0;
        return aluguel = dias * 100;
    }
}

class Moto extends Veiculo{
    public Moto(int dias){
        super(dias);
    }

    @Override
    public double calcularAluguel(){
        double aluguel = 0;
        return aluguel = dias * 50;
    }

}

class Caminhao extends Veiculo{
    public Caminhao(int dias){
        super(dias);
    }

    @Override
    public double calcularAluguel(){
        double aluguel = 0;
        return aluguel = 150 * dias;
    }
}

class Bicicleta extends Veiculo{
    public Bicicleta(int dias){
        super(dias);
    }

    @Override
    public double calcularAluguel(){
        double aluguel = 0;
        return aluguel = 15 * dias;
    }
}

public class ex5 {
    public static void main(String[] args) {
        ArrayList <Veiculo> lista = new ArrayList<>();

        lista.add(new Carro(15));
        lista.add(new Moto(10));
        lista.add(new Caminhao(3));
        lista.add(new Bicicleta(1));

        for(Veiculo v : lista){
            System.out.println(v.calcularAluguel());
        }
    }
}
