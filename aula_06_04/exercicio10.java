class User{
    String nome;
    String email;
    String senha;

    public User(String nome, String email, String senha){
        
        if (senha.length() >= 6) {
            this.nome = nome;
            this.email = email;
            this.senha = senha;
        } else {
            System.out.println("Erro! Senha deve conter no minimo 6 caracteres!");
        }
        
    }
}

public class exercicio10 {
    public static void main(String[] args) {
        User user1 = new User("Felipe Trindade", "felipe@teste.com", "12345");
        System.out.println();
    }
}
