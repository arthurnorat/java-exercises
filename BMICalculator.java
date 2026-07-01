package exercicios;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("----RESULTADO----%n");

        if (imc < 18.5) {
            System.out.printf("Seu IMC é %.2f e você está abaixo do peso", imc);
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf("Seu IMC é %.2f e você está no peso ideal. Parabéns!", imc);
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.printf("Seu IMC é %.2f e você está levemente acima do peso", imc);
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.printf("Seu IMC é %.2f e você está com obesidade Grau I", imc);
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.printf("Seu IMC é %.2f e você está com obesidade Grau II (severa)", imc);
        } else {
            System.out.printf("Seu IMC é %.2f e você está com obesidade Grau III (mórbida)", imc);
        }

        sc.close();
    }
}
