package exercicios;

import java.util.Scanner;

public class SalaryMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Insira o salário do usuário: ");
        double salarioUsuario = sc.nextDouble();

        double resultado = salarioUsuario / 1293.20;

        System.out.printf("O usuário ganha %.2f do salário mínimo", resultado);

        sc.close();
    }
}
