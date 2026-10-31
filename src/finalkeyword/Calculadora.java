package finalkeyword;

public class Calculadora {
    final int somar(int a, int b) {
        return a + b;
    }
}

class CalculadoraCientifica extends Calculadora {

//    Comentei porque o IntelliJ manda remover final de Calculadora.somar
//    @Override
//    int somar (int a, int b) {
//        return a + b;
//    }

}


