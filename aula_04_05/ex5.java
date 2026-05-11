class FormaGeometrica {
    public void calcularArea() {
        System.out.println("Forma não escolhida!");
    }
}

class Quadrado extends FormaGeometrica {
    double lado1;
    double lado2;

    public Quadrado(double lado1, double lado2) {
        if (lado1 == lado2) {
            this.lado1 = lado1;
            this.lado2 = lado2;
        } else {
            System.out.println("Para ser um quadrado, todos os lados devem ser iguais!");
        }
    }

    @Override
    public void calcularArea() {
        double areaQuadrado = 0;
        areaQuadrado = lado1 * lado2;

        System.out.println("A área do quadrado é: " + areaQuadrado);
    }
}

class Circulo extends FormaGeometrica {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double pi = 3.14;
        double areaCirculo = 0;

        areaCirculo = pi * (raio * raio);

        System.out.println("A área do quadrado é: " + areaCirculo);
    }
}

public class ex5 {
    public static void main(String[] args) {
        FormaGeometrica forma1 = new Quadrado(15, 15);
        FormaGeometrica forma2 = new Circulo(25);

        forma1.calcularArea();
        forma2.calcularArea();
    }
}
