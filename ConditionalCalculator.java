package exercicios;

import java.util.Scanner;

public class ConditionalCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o primeiro número: ");
        int A = sc.nextInt();

        System.out.printf("Digite o segundo número: ");
        int B = sc.nextInt();

        int C = (A == B) ? A + B : A * B;

        System.out.printf("\nO valor de C é %d", C);

        sc.close();
    }
}
