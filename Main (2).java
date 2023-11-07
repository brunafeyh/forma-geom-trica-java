import java.util.ArrayList;
import java.util.List;

// Classe base para formas geométricas
abstract class FormaGeometrica {
    public abstract double getArea();
}

// Classe para representar um ponto no plano
class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

// Classe para representar um círculo
class Circulo extends FormaGeometrica {
    private Ponto centro;
    private double raio;

    public Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }
}

// Classe para representar um retângulo
class Retangulo extends FormaGeometrica {
    private Ponto ponto1;
    private Ponto ponto2;

    public Retangulo(Ponto ponto1, Ponto ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }

    @Override
    public double getArea() {
        double base = Math.abs(ponto1.getX() - ponto2.getX());
        double altura = Math.abs(ponto1.getY() - ponto2.getY());
        return base * altura;
    }
}

// Classe para representar um triângulo retângulo
class TrianguloRetangulo extends FormaGeometrica {
    private Ponto ponto1;
    private Ponto ponto2;

    public TrianguloRetangulo(Ponto ponto1, Ponto ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }

    @Override
    public double getArea() {
        double base = Math.abs(ponto1.getX() - ponto2.getX());
        double altura = Math.abs(ponto1.getY() - ponto2.getY());
        return (base * altura) / 2;
    }
}

// Classe para representar uma esfera
class Esfera extends FormaGeometrica {
    private Ponto centro;
    private double raio;

    public Esfera(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * raio * raio;
    }
}

public class Main {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<>();

        formas.add(new Circulo(new Ponto(0, 0), 5));
        formas.add(new Retangulo(new Ponto(0, 0), new Ponto(3, 4)));
        formas.add(new TrianguloRetangulo(new Ponto(0, 0), new Ponto(3, 4)));
        formas.add(new Esfera(new Ponto(0, 0), 5));

        for (FormaGeometrica forma : formas) {
            System.out.println("Área: " + forma.getArea());
        }
    }
}
