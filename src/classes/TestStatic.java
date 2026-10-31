package classes;

public class TestStatic {
    public static void exibirValor(int a) { // com static, pode ser chamado sem criar um objeto da classe
        System.out.println("Valor: " + a);
    }

    public void mostrarValor(int a) { // sem static, precisa criar um objeto da classe para chamar o método
        System.out.println("Valor: " + a);
    }

    static void main(String[] args) {
        exibirValor(10);
        TestStatic teste = new TestStatic();
        teste.mostrarValor(20);

    }
}
