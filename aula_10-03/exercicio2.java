import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        double numero1, numero2;
        double resultado;

        System.out.println("=== CALCULADORA ===");
        System.out.println("Digite o primeiro numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        numero2 = entrada.nextInt();

        System.out.println("Digite a operação desejada \n1 - Soma \n2 - Subtração \n3 - Multiplicação \n4 - Divisão");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Soma = " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Subtração = " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Multiplicação = " + resultado);
                break;
            case 4:
                resultado = numero1 / numero2;
                System.out.println("Divisão = " + resultado);
                break;
        
            default:
                System.out.println("Opção inválida!");
                break;
        }



    }
}
