package basics;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura (ex: 1.70): ");
        double altura = scanner.nextDouble();

        System.out.print("É estudante? (true/false): ");
        boolean estuda = scanner.nextBoolean();

        scanner.close();

//        String estudante; // Escopo global
//        if (estuda) {
//            estudante = "Sim";
//        } else {
//            estudante = "Não";
//        }

        // Operador ternário
        String estudante = estuda ? "Sim" : "Não";

        int anoDeNascimento = 2025 - idade;

        System.out.println("\n=== DADOS CADASTRADOS ===");
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Estudante: " + estudante);
        System.out.println("Ano de nascimento: " + anoDeNascimento);
    }
}
