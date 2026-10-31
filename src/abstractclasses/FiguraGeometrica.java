package abstractclasses;

public abstract class FiguraGeometrica {
    public abstract int calcularArea(); // Não precisa de corpo se tiver abstract
    public abstract int calcularPerimetro();
}

class Retangulo extends FiguraGeometrica {
    private int b, h;

    Retangulo(int b, int h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public int calcularArea() {
        return b * h;
    }

    @Override
    public int calcularPerimetro() {
        return 2 * (b + h);
    }
}

class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(7, 4);
        System.out.printf("A área do retângulo é %d%n", retangulo.calcularArea());
        System.out.printf("O perímetro do retângulo é %d%n", retangulo.calcularPerimetro());
    }
}