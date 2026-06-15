package exercicios;

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        String paridade = (num % 2 == 0) ? "Par" : "Ímpar";

        String sinal;
        if (num > 0) {
            sinal = "Positivo";
        } else if (num < 0) {
            sinal = "Negativo";
        } else {
            sinal = "Zero";
        }

        System.out.printf("\n---- RESULTADO ----");
        System.out.printf("%nO Número %d é %s e %s", num, paridade, sinal);

        sc.close();
    }
}
