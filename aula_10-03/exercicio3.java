import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("=== VAMOS CALCULAR A MEDIA ===");
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.printf("Nota final: %.2f\n", media );
            System.out.println("Aprovado!");
        } else if (media >= 5 && media < 7){
            System.out.printf("Nota final: %.2f\n", media );
            System.out.println("Recuperação!");
        } else {
            System.out.printf("Nota final: %.2f\n", media );
            System.out.println("Reprovado!");
        }
    }
}
