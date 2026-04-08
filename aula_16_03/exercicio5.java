public class exercicio5 {
    public static void main(String[] args) {
        int quadradomagico[][] = {
        {4, 9, 2},
        {3, 5, 7},
        {8, 1, 6}};
        int soma = 0;
        int magico = 0;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                soma =  soma + quadradomagico[i][j];
            }
            if (soma == 15) {
                System.out.println("Valor da linha: " + soma + "É mágico!");
                soma = 0;
                magico++;
            } else {
                System.out.println("Valor da linha: " + soma + "Não é mágico!");
                return;
            }
        }

        if (magico == 3) {
            System.out.println("As linhas são de um quadrado mágico! :D");
        } else {
            System.out.println("As linhas não são de um quadrado mágico! :c");
        }

        for (int j = 0; j <= 2; j++) {
            for (int i = 0; i <= 2; i++) {
                soma =  soma + quadradomagico[i][j];
            }
            if (soma == 15) {
                System.out.println("Valor da coluna: " + soma + "É mágico!");
                soma = 0;
                magico++;
            } else {
                System.out.println("Valor da coluna: " + soma + "Não é mágico!");
                return;
            }
        }
        
        if (magico == 6) {
            System.out.println("As colunas são de um quadrado mágico! :D");
        } else {
            System.out.println("As colunas não são de um quadrado mágico! :c");
        }

    }
}
