package exercicios;

import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menor, meio, maior;

        System.out.printf("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.printf("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.printf("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            maior = num1;
        } else if (num2 > num1 && num2 > num3) {
            maior = num2;
        } else {
            maior = num3;
        }

        if (num1 < num2 && num1 < num3) {
            menor = num1;
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
        } else {
            menor = num3;
        }

        if (num1 != maior && num1 != menor) {
            meio = num1;
        } else if (num2 != maior && num2 != menor) {
            meio = num2;
        } else {
            meio = num3;
        }

        System.out.printf("%n----Resultado----%n");



        System.out.printf("A ordem decrescente dos números é %d, %d e %d%n", maior, meio, menor);


    }
}
