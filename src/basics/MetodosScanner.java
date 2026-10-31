package basics;

import java.util.Scanner;

public class MetodosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler String (linha completa)
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Ler int
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Ler double
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        // Ler boolean
        System.out.print("É estudante? (true/false): ");
        boolean estudante = scanner.nextBoolean();

        // Ler apenas uma palavra (até o espaço)
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.next();

        scanner.close();

        // Exibir os dados
        System.out.println("\n=== Dados Informados ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Altura: %.2fm\n", altura);
        System.out.println("Estudante: " + estudante);
        System.out.println("Palavra: " + palavra);
    }
}