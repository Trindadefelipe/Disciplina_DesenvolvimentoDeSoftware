public class Animal {
    String nome;

    void emitirSom(){
        System.out.println("O animal está fazendo um som!");
    }

    public static void main(String[] args) {
        System.out.println();
        Animal animal1 = new Animal();

        animal1.emitirSom();
    }
}
