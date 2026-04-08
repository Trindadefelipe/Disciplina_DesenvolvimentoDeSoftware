class Universidade {
    String nome;
    String cidade;
    
    void faculdade() {
        System.out.println("Universidade: " + nome);
        System.out.println("Campus: " + cidade);
    }

}
class Professor {
    String nome;
    String disciplina;
    
    void ministro() {
        System.out.println("Professor: " + nome);
        System.out.println("Disciplina Ministrada: " + disciplina);
    }
    
}

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Professor professor1 = new Professor();
        Universidade universidade1 = new Universidade();

        professor1.nome = "Felipe Trindade";
        professor1.disciplina = "Desenvolvimento de Software";

        universidade1.nome = "Universidade Positivo";
        universidade1.cidade = "Londrina";

        professor1.ministro();
        universidade1.faculdade();
        
    }

}
