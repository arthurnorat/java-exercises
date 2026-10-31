package basics;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        // 1. Criar objeto scanner
        Scanner scanner = new Scanner(System.in);

        // 2. Usar o scanner para ler dados
        System.out.print("Digite seu primeiro nome: ");
        String nome = scanner.nextLine();

        // 3. Fechar o scanner - boa prática
        scanner.close();

        System.out.print("Olá, " + nome + "!");
    }
}
