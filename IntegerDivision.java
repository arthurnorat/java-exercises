// Faça um algoritmo que leia dois valores inteiros A e B
// e imprima na tela o quociente e o resto da divisão inteira entre eles

package exercicios;

import java.util.Scanner;

public class IntegerDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, quociente, resto;

        System.out.printf("Insira o primeiro número: ");
        a = sc.nextInt();

        System.out.printf("Insira o segundo número: ");
        b = sc.nextInt();

        quociente = a / b;
        resto = a % b;

        System.out.printf("%n----RESULTADO----%n");
        System.out.printf("O quociente da divisão %d / %d é %d e o resto é %d%n", a, b, quociente, resto);

        sc.close();
    }
}
