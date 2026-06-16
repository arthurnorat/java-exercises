package exercicios;

import java.util.Scanner;

public class SucessorPredecessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int sucessor = num + 1;
        int antecessor = num - 1;

        System.out.printf("----RESULTADO----");
        System.out.printf("%nO sucessor de %d é %d e o antecessor é %d", num, sucessor, antecessor);

        sc.close();
    }
}
