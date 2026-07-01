// Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada

package exercicios;

import java.util.Scanner;

public class CustomMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", num, i, (num * i));
        }

        sc.close();
    }
}
