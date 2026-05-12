package aula_11_05;

public class ex1 {
    public static void main(String[] args) {
        final double PI = 3.14;
        System.out.println(PI);

        double raio = 10;
        //PI = 10; Erro: não é possível
        double area = PI * raio * raio;
        System.out.println("Área do círculo: " + area);
    }    
}
