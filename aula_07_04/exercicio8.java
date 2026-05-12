class Aluno {
    String nome;
    int nota;
    boolean aprovado;

    public Aluno(String nome, int nota){
        this.nome = nome;

        if(nota >= 0  && nota <= 10){
            this.nota = nota;
        } else {
            System.err.println("Nota inválida");
        }

        if(this.nota >= 6){
            this.aprovado = true;
        } else {
            this.aprovado = false;
        }

    }
}

public class exercicio8 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Fernando", 6);

        System.out.println("Aluno: " + a1.nome);
        System.out.printf("\nNota: %d", a1.nota);
        System.out.printf("\nSituação: %s", (a1.aprovado ? "Aprovado" : "Reprovado"));
    }
}