package exercicios;

import java.util.Scanner;

public class AgeVerifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        String maioridade;

        System.out.printf("Insira o nome: ");
        nome = sc.nextLine();

        System.out.printf("Insira a idade: ");
        idade = sc.nextInt();

        if (idade >= 0 && idade < 18) {
            maioridade = "menor de idade";
        } else if (idade >= 18) {
            maioridade = "maior de idade";
        } else {
            System.out.printf("Insira um número válido");
            return;
        }

        System.out.printf("%n----RESULTADO----%n");
        System.out.printf("%s tem %d anos e é %s%n", nome, idade, maioridade);

        sc.close();
    }
}
