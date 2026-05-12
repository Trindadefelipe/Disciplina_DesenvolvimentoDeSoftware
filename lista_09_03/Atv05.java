package lista_09_03;

import java.util.Scanner;

public class Atv05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int senha = 0;

        while (senha != 1234) {
            System.out.println("Digite a senha:");
            senha = entrada.nextInt();
        }

        entrada.close();

        System.out.println("Acesso Liberado!");
    }
}
