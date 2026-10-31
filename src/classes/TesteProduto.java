package classes;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Detergente", 5.00, 3);
        Produto produto2 = new Produto("Amaciante", 10.00, 4);

        produto1.exibirInformacoes();
        produto2.exibirInformacoes();

    }
}