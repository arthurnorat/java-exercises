package exercicios;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        String validade, classificacao;

        System.out.printf("Insira o primeiro lado do triângulo: ");
        a = sc.nextInt();

        System.out.printf("Insira o segundo lado do triângulo: ");
        b = sc.nextInt();

        System.out.printf("Insira o terceiro lado do triângulo: ");
        c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            validade = "válido";
        } else {            
            System.out.printf("O triangulo é inválido.");
            sc.close();
            return;
        }

        if (a == b && b == c) {
            classificacao = "equilátero";
        } else if (a == b || a == c || b == c) {
            classificacao = "isósceles";
        } else {
            classificacao = "escaleno";
        }

        System.out.printf("%n----RESULTADO----%n");
        System.out.printf("O triângulo é %s e %s.%n", validade, classificacao);

        sc.close();
    }
}
