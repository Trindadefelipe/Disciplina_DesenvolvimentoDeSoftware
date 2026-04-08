import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Digite a opção desejada: 1 - Java 2 - Python ou 3 - JavaScript");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("1 - JAVA");
                break;
            case 2:
                System.out.println("2 - PYTHON");
                break;
            case 3:
                System.out.println("3 - JAVA SCRIPT");
                break;
        
            default:
                break;
        }
    }
}
