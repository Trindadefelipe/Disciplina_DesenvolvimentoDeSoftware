package aula_11_05;
import java.util.ArrayList;

public class ex2 {
    public static void main(String[] args) {
        ArrayList <Double> notas = new ArrayList<>();
        final double MEDIA_MINIMA = 7;
        double soma = 0;

        notas.add(8.0);
        notas.add(9.0);
        notas.add(7.5);

        for(Double n : notas){
            soma += n;
        }
        
        double media = soma / notas.size();

        if (media >= MEDIA_MINIMA) {
            System.out.println("Aprovado: " + media);
        } else {
            System.out.println("Reprovado: " + media);
        }
    }
}
