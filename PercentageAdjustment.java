package exercicios;

import java.util.Scanner;

public class PercentageAdjustment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double num = sc.nextDouble();
        double reajustado = num * 1.05;

        System.out.printf("O número %.2f com reajuste de 5%% é %.2f", num, reajustado);

        sc.close();
    }
}
