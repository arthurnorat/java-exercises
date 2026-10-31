package basics;

public class CalculadoraJava {
    public static void main(String[] args) {

        int numero1 = 15;
        int numero2 = 4;

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2;
        int resto = numero1 % numero2;

        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.printf("Divisão: %.2f\n", divisao);
        System.out.println("Resto: " + resto);

        boolean maior = numero1 > numero2;
        boolean positivo = numero1 > 0 && numero2 > 0;
        double media = (numero1+ numero2)/2.0;

        System.out.println(numero1 + " é maior do que " + numero2 + "? " + maior);
        System.out.println("Ambos são positivos? " + positivo);
        System.out.println("Média: " + media);
    }
}