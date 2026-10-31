// 18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros
// por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Sara
// seja maior que Francisco.

package loops;

public class HeightComparison {
    public static void main(String[] args) {
        int francisco = 150;
        int sara = 110;
        int anos = 0;

        for (anos = 0; sara <= francisco; anos++) {
            sara += 3;
            francisco += 2;
        }

        System.out.printf("%n----RESULTADO----%n");
        System.out.printf("Sara levará %d anos para ser maior que Francisco.%n", anos);

    }
}
