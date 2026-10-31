package abstractclasses;

abstract class Carro {
    int codigo = 10;

    Carro(int cod) {
        codigo = cod;
    }

    abstract void acelerar();

    void frear() {
        System.out.printf("O carro está freando.%n");
    }
}

class CarroF1 extends Carro {

    CarroF1 (int codigo) {
        super(codigo);
    }

    @Override
    void acelerar() {
        System.out.printf("O carro de F1 está acelerando muito rapidamente.%n");
    }
}

class Caminhao extends Carro {
    Caminhao (int codigo) {
        super(codigo);
    }

    @Override
    void acelerar() {
        System.out.printf("O caminhão está acelerando lentamente...%n");
    }
}

class TesteAbstract {
    public static void main(String[] args) {
        CarroF1 carroF1 = new CarroF1(20);
        Caminhao caminhao = new Caminhao(1000);

        carroF1.acelerar();
        carroF1.frear(); // Vai procurar na classe abstrata

        caminhao.acelerar();
        caminhao.frear(); // Por isso a mensagem é igual, já que é o mesmo método

        System.out.printf("Código do caminhão: %d%n", caminhao.codigo);
        caminhao.codigo = 888;
        System.out.printf("Código trocado: %d%n", caminhao.codigo);

        System.out.printf("Código do carro: %d%n", carroF1.codigo);

    }
}