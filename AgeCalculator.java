package exercicios;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia, mes, ano;

        System.out.printf("Insira o ano de nascimento: ");
        ano = 2026 - sc.nextInt();

        System.out.printf("Insira o mês de nascimento: ");
        mes = 6 - sc.nextInt();

        System.out.printf("Insira o dia de nascimento: ");
        dia = 23 - sc.nextInt();

        System.out.printf("%n----RESULTADO----%n");
        System.out.printf("%d anos, %d meses e %d dias de vida", ano, mes, dia);

        sc.close();
    }
}
