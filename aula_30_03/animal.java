class Animal{
    String nome;
}
class Cachorro extends Animal{
    String raca;
}

public class animal {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Lunna";
        cachorro1.raca = "Golden";

        System.out.println("Nome do cachorro: " + cachorro1.nome);
        System.out.println("Raça do cachorro: " + cachorro1.raca);
    }
}
