package interfaces;

public interface Veiculo {
    void iniciar();

    void parar();

    default void buzinar() {
        System.out.printf("Buzinando.%n");
    }
}

class Carro implements Veiculo {

    @Override
    public void iniciar() {
        System.out.printf("O carro iniciou.%n");
    }

    @Override
    public void parar() {

    }
}

class Caminhao implements Veiculo {

    @Override
    public void iniciar() {
        System.out.printf("O caminhão iniciou.%n");
    }

    @Override
    public void parar() {

    }
}

class Main {
    static void main(String[] args) {

        Carro carro = new Carro();
        carro.iniciar();
        carro.buzinar();


        Caminhao caminhao = new Caminhao();
        caminhao.iniciar();
        caminhao.buzinar();

    }
}
