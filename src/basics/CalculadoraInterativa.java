package basics;

import java.util.Scanner;

public class CalculadoraInterativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler os números
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        // Calcular
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2;
        int resto = numero1 % numero2;

        boolean maior = numero1 > numero2;
        boolean positivos = numero1 > 0 && numero2 > 0;
        double media = (numero1 / numero2) / 2.0;

        // Exibir resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println();
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.printf("Divisão: %.2f\n", divisao);
        System.out.println("Resto: " + resto);
        System.out.println();
        System.out.println(numero1 + " é maior que " + numero2 + "? " + maior);
        System.out.println("Ambos são positivos? " + positivos);
        System.out.printf("Média: %.2f\n", media);

    }
}
