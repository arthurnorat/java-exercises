package basics;

import java.util.Scanner;

public class IfElseElseIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite sua terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3.0;

        if (nota1 < 4.0 || nota2  < 4.0 || nota3 < 4.0 || media < 5) {
            System.out.println("Aluno reprovado");
        } else if (media >= 5.0 && media < 7) { // Essa comparação com 5.0 é redundante
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Aluno aprovado");
        }

        System.out.printf("A média das notas foi: %.2f\n", media);

        scanner.close();
    }
}