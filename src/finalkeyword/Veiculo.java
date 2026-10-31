package finalkeyword;

public class Veiculo {
    void ligarMotor() {
        System.out.printf("Motor ligado");
    }
}

// IntelliJ acusa erro e manda tirar final de Veiculo
class Carro extends Veiculo {

}
