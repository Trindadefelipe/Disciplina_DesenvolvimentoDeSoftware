import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[10];

        for (int i = 0; i <= 9; i++) {
            System.out.printf("Digite um numero inteiro: ");
            numeros[i] = entrada.nextInt();
        }
        
        for (int i = 0; i <= 9; i++) {
            if (numeros [i] % 2 == 0 ) {
                System.out.println("Numero: " + numeros [i] + " - Par!");
            }
        }
        
    }
}
