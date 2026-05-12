class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;

    }
   
}
public class exercicio5{
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Quixote ", "Miguel de Cervantes", 1328);
        System.out.println(livro1.getTitulo());
        System.out.println(livro1.getAutor());
        System.out.println(livro1.getPaginas());
    }
}