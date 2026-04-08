import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        int numero = 1;

        while (numero != 0) {
            System.out.println("Digite um numero para soma-lo: ");
            numero = entrada.nextInt();
            soma = soma + numero;
        }

        System.out.println("Resultado da soma: " + soma);
    }
}
