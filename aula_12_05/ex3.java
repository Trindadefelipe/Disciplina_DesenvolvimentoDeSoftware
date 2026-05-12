package aula_12_05;

public class ex3 {
    public static void main(String[] args) {
        String preco = "199.90";

        Double valor = Double.parseDouble(preco);

        valor = valor - (valor * 0.10);

        System.out.println(valor);
    }

}
