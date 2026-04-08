import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        float vetor[] = new float[10];
        double media, soma = 0;
        float maior = vetor[0];
        float menor = vetor[0];

        // O try-with-resources garante o fechamento automático do Scanner
        try (Scanner entrada = new Scanner(System.in)) {
            
            // Recebendo valores e somando
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o " + (i + 1) + "º numero: ");
                vetor[i] = entrada.nextFloat(); 
                soma += vetor[i];
            }

            for (int i = 1; i < 10; i++) {
                if (vetor[i] > maior) {
                    maior = vetor[i];
                }
                if (vetor[i] < menor) {
                    menor = vetor[i];
                }
            }

            media = soma / 10;

            System.out.println("\n--- Resultados ---");
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            
        } // Scanner fecha aqui automaticamente
    }
}