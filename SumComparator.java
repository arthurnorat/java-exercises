package exercicios;

import java.util.Scanner;

public class SumComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = sc.nextInt();

        int soma = a + b;
        boolean isMenor = soma < c;

        System.out.println("\n---- RESULTADO ----");
        System.out.printf("Soma: %d + %d = %d%n", a, b, soma);
        System.out.printf("Soma é menor do que %d? %b", c, isMenor);

        sc.close();
    }
}
