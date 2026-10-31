// Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
// As informações fornecidas serão: valor da hora-aula, número de aulas lecionadas no mês e
// percentual de desconto do INSS. Imprima na tela o salário líquido final.

package fundamentals;

import java.util.Scanner;

public class NetSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Insira o valor da hora-aula: ");
        double valor = sc.nextDouble();

        System.out.printf("Insira a quantidade de horas: ");
        double horas = sc.nextDouble();

        double salarioBruto = valor * horas;

        double inss;
        if (salarioBruto >= 1621) {
            inss = 0.075;
        } else if (salarioBruto > 1621 && salarioBruto <= 2902.84) {
            inss = 0.09;
        } else if (salarioBruto > 2902.84 && salarioBruto <= 4354.27) {
            inss = 0.12;
        } else {
            inss = 0.14;
        }

        double salarioLiquido = salarioBruto - (salarioBruto * inss);

        System.out.printf("%n----RESULTADO----%n");
        System.out.printf("O salário líquido desse professor é R$ %.2f%n", salarioLiquido);

        sc.close();
    }
}
