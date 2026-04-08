public class Pessoa {
    String nome;
    int idade;

    void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        System.out.println();
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Felipe Trindade";
        pessoa1.idade = 25;

        pessoa1.apresentar();


    }
}
