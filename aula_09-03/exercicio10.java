import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int senha = 0;

        while (senha != 1234) {
            System.out.println("Digite uma senha para abrir o cofre!");
            senha = entrada.nextInt();
            System.out.println("Senha incorreta! Digite novamente!");
        }

        System.out.println("Cofre aberto! Parabens!");
    }
}
