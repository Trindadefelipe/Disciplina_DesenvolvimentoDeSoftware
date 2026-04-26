package ListaRevisão;

class Pessoa {
  private String nomePessoa;
  private int idadePessoa;

  public Pessoa(String nomePessoa, int idadePessoa) {
    this.nomePessoa = nomePessoa;
    if (idadePessoa >= 0) {
      this.idadePessoa = idadePessoa;
    } else {
      System.out.println("Valor de idade inválido!");
    }
  }

  public String getNomePessoa() {
    return nomePessoa;
  }

  public int getIdadePessoa() {
    return idadePessoa;
  }
}

public class ex1 {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("Felipe Trindade", 25);
    Pessoa pessoa2 = new Pessoa("Daniel Herique", -15);

    System.err.println(pessoa1.getNomePessoa());
    System.err.println(pessoa1.getIdadePessoa());
    System.err.println(pessoa2.getNomePessoa());
    System.err.println(pessoa2.getIdadePessoa());
  }
}
