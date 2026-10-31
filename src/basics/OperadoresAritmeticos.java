package basics;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Operações básicas
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);

        // CUIDADO: Divisão de inteiros

        int x = 10;
        int y = 3;
        int resultadoInteiro = x / y;
        double resultadoDecimal = x / y;

        System.out.println("Resultado Inteiro: " + resultadoInteiro);
        System.out.println("Resultado Decimal: " + resultadoDecimal);

        // Correto: pelo menos um dos números deve ser double
        double resultadoCorreto1 = (double) x / y;
        double resultadoCorreto2 = x / 3.0;
        double resultadoCorreto3 = 10.0 / 3;

        System.out.printf("Divisão correta: %.2f\n", resultadoCorreto1);
        System.out.printf("Resultado correto: %.2f\n", resultadoCorreto2);
        System.out.printf("Resultado correto: %.2f\n", resultadoCorreto3);
    }
}
