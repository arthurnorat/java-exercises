// Faça um algoritmo que mostre um valor aleatório entre 0 e 100

package exercicios;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 101);
        System.out.printf("O número aleatório gerado foi %d", randomNumber);
    }
}
