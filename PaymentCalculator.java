package exercicios;

import java.util.Scanner;

public class PaymentCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precoFinal;
        double preco;
        int formaDePagamento;

        System.out.printf("Insira o preço do produto: ");
        preco = sc.nextDouble();

        System.out.printf("%n[1] À Vista em Dinheiro ou Pix, recebe 15%% de desconto%n" +
                "[2] À Vista no cartão de crédito, recebe 10%% de desconto%n" +
                "[3] Parcelado no cartão em duas vezes, preço normal do produto sem juros%n" +
                "[4] Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%%%n" +
                "Insira a forma de pagamento: ");
        formaDePagamento = sc.nextInt();

        switch (formaDePagamento) {
            case 1:
                precoFinal = preco * 0.85;
                break;
            case 2:
                precoFinal = preco * 0.90;
                break;
            case 3:
                precoFinal = preco;
                break;
            case 4:
                precoFinal = preco * 1.10;
                break;
            default:
                System.out.printf("Forma de pagamento inválida! Escolha entre 1 e 4.%n");
                return;
        }

        System.out.printf("O preço final do produto é R$ %.2f", precoFinal);

        sc.close();
    }
}