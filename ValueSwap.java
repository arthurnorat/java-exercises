package exercicios;

import java.util.Scanner;

public class ValueSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.printf("Insira o primeiro valor: ");
        a = sc.nextInt();

        System.out.printf("Insira o segundo valor: ");
        b = sc.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.printf("%n----RESULTADO----%n");
        System.out.printf("Agora o primeiro valor é %d e o segundo valor é %d%n", a, b);

        sc.close();
    }
}
