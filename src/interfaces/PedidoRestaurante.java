package interfaces;

public interface PedidoRestaurante {
    void adicionarItens(String item, double preco);

    double calcularTotal();
}

class Pedido implements PedidoRestaurante {
    private double total = 0;

    @Override
    public void adicionarItens(String item, double preco) {
        System.out.printf("Adicionando %s (R$ %.2f) ao pedido.%n", item, preco);
        total += preco;
    }

    @Override
    public double calcularTotal() {
        return total;
    }

     public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItens("Carne", 10.0);
        pedido.adicionarItens("Feijão", 5.0);
        pedido.adicionarItens("Arroz", 3.0);

        System.out.printf("Valor total do pedido: R$ %.2f", pedido.calcularTotal());
    }
}
