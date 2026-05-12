package lista_09_03;

import java.util.Scanner;

public class Atv04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1, soma = 0;

        while(i != 0) {
            System.out.println("Digite um número:");
            i = entrada.nextInt();
            soma += i;
        }

        entrada.close();
        System.out.println("Soma total: " + soma);
    }
}
