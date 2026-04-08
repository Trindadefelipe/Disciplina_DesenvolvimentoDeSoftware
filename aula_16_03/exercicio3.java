public class exercicio3 {
    public static void main(String[] args) {
        int i = 10;
        int j = 2;
        int x = 0;
        int y = 0;

        j++;
        ++i;
        x = i++ + j;
        y = ++j + ++i;

        System.out.println(i);
        System.out.println(j);
        System.out.println(x);
        System.out.println(y);
    }
}

