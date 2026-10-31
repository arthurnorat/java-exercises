package annotations;

public class MinhaClasseDeprecated {
    public int calcularSoma(int a, int b) {
        return a + b;
    }

    @Deprecated
    public int calcularProduto(int a, int b) {
        return a * b;
    }
}

class PrincipalDeprecated {
    public static void main(String[] args) {
        MinhaClasseDeprecated minhaClasseDeprecated = new MinhaClasseDeprecated();

        int resultadoSoma = minhaClasseDeprecated.calcularSoma(3, 4);
        int resultadoProduto = minhaClasseDeprecated.calcularProduto(3, 4);

        System.out.printf("Soma: %d%n", resultadoSoma);
        System.out.printf("Produto: %d", resultadoProduto);

    }
}
