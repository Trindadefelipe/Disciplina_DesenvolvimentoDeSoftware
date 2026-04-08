public class exercicio1 {
    public static void alterarvetor(int[] vetor) {
        vetor[0] = 23;
    }

    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4};

        alterarvetor(vetor);
        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
        System.out.println(vetor[3]);
        
    }
}