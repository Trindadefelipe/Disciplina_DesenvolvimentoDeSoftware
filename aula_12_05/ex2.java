package aula_12_05;
import java.util.ArrayList;

public class ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        for(Integer i : lista){
            System.out.println(i);
        }
    }
}
