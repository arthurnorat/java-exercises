package exercicios;

import java.util.Scanner;

public class StudentApproval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.printf("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.printf("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.printf("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.printf("Digite a quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        System.out.printf("%n---- RESULTADO ---%n");

        if (media >= 7.0) {
            System.out.printf("%s tirou notas %.2f, %.2f, %.2f e %.2f. Média: %.2f. Está aprovado!%n", nome, nota1, nota2, nota3, nota4, media);
        } else {
            System.out.printf("%s tirou notas %.2f, %.2f, %.2f e %.2f. Média: %.2f. Está reprovado!%n", nome, nota1, nota2, nota3, nota4, media);
        }

        sc.close();
    }

}
