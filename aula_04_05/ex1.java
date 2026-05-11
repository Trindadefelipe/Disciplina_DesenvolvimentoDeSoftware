class Animal{
    public void emitirSom(){
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }
}

class Gato extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("Miando");
    }
}

public class ex1 {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        animal1.emitirSom();
        animal2.emitirSom();
    }
    
}