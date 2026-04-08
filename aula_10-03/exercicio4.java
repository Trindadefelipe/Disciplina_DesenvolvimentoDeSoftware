import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero, resultado = 0;

        System.out.println("Vamos Calcular 5 numeros!");
        
        for (int i = 1; i <= 5; i++ ) {
            System.out.print("Digite o " + i + "° numero: ");
            numero = entrada.nextDouble();
            resultado = numero + resultado;
        }
        System.out.printf("Resultado da soma: %f", resultado);
    }
}
