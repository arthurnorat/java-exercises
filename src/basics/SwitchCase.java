package basics;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 4");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Opção 1");
                break;
            case 2:
                System.out.println("Opção 2");
                break;
            case 3:
                System.out.println("Opção 3");
                break;
            case 4:
                System.out.println("Opção 4");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
