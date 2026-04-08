class Pessoa{
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        };
    }
}
class exercicio1{
    public static void main(String[] args) {
        Pessoa user1 = new Pessoa();
        Pessoa user2 = new Pessoa();
        user1.setNome("Felipe Trindade");
        user1.setIdade(25);
        System.out.println(user1.getNome());
        System.out.println(user1.getIdade());

        user2.setNome("Higor Bueno");
        user2.setIdade(-24);
        System.out.println(user2.getNome());
        System.out.println(user2.getIdade());
    }
}