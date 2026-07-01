package exercicios;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.printf("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.printf("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3.0;

        System.out.printf("%n----RESULTADO----%n");
        System.out.printf("A média das notas %.2f, %.2f e %.2f é %.2f.", nota1, nota2, nota3, media);

        sc.close();
    }
}
