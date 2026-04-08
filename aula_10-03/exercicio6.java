public class exercicio6 {
    public static void main(String[] args) {
        int numero[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0 ; j < 3; j++) {
                numero[i][j] = i + 2;
                System.out.print(numero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
