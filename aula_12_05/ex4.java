package aula_12_05;

public class ex4 {
    public static void main(String[] args) {
        char variavel = '9';

        if (Character.isLetter(variavel)) {
            System.out.println("É um caracter de letra!");
        } else {
            System.out.println("É um caracter de digito!");
        }
    }
}
