package basics;

import java.util.Scanner;

public class CalculadoraDeIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / Math.pow(altura, 2);
        String categoria = "";

        if (imc < 18.5) {
            categoria = "Abaixo do peso";
        } else if (imc < 25) {
            categoria = "Peso normal";
        } else if (imc < 30) {
            categoria = "Sobrepeso";
        } else {
            categoria = "Obesidade";
        }

        switch (categoria) {
            case "Abaixo do peso":
                System.out.printf("Seu IMC é %.2f e você está abaixo do peso\n", imc);
                break;
            case "Peso normal":
                System.out.printf("Seu IMC é %.2f e seu peso está normal\n", imc);
                break;
            case "Sobrepeso":
                System.out.printf("Seu IMC é %.2f e você está com sobrepeso\n", imc);
                break;
            case "Obesidade":
                System.out.printf("Seu IMC é %.2f e você está obeso\n", imc);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        scanner.close();
    }
}