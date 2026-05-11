class Veiculo{
    public void mover(){
        System.out.println("Andou!");
    }
}

class Moto extends Veiculo{
    @Override
    public void mover(){
        System.out.println("Moto andando!");
    }
}

class Carro extends Veiculo{
    @Override
    public void mover(){
        System.out.println("Carro andando!");
    }
}

public class ex3 {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro();
        Veiculo veiculo2 = new Moto();

        veiculo1.mover();
        veiculo2.mover();
    }
}
