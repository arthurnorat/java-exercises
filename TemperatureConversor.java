package exercicios;

import java.util.Scanner;

public class TemperatureConversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Insira a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (5 * (fahrenheit - 32)) / 9;

        System.out.printf("A temperatura em Celsius é %.2f", celsius);

        sc.close();
    }
}
