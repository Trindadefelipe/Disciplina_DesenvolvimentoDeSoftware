package lista_09_03;

import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = 1;

        while (numero != 0) {
            System.out.println("Digite um número (0 para sair):");
            numero = entrada.nextInt();
        }

        entrada.close();
        
        System.out.println("Programa finalizado!");
    }
}