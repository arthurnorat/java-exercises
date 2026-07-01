package exercicios;

import java.util.Scanner;

public class BooleanValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o primeiro valor true ou false: ");
        boolean valor1 = sc.nextBoolean();

        System.out.printf("Digite o segundo valor true ou false: ");
        boolean valor2 = sc.nextBoolean();

        System.out.printf("%n---- RESULTADO ----%n");
        if (valor1 && valor2) {
            System.out.printf("Ambos os valores são true%n");
        } else if (!valor1 && !valor2) {
            System.out.printf("Ambos os valores são false%n");
        } else {
            System.out.printf("Um dos valores é true e o outro é false%n");
        }

        sc.close();
    }
}
