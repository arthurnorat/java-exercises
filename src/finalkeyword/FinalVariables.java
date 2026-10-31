package finalkeyword;

public class FinalVariables {
    final int NUMERO_MAXIMO = 100;
    final String MENSAGEM = "String constante";

    public void imprimirValoresFinais() {
        System.out.printf("Número máximo: %d%n", NUMERO_MAXIMO);
        System.out.printf("Mensagem: %s", MENSAGEM);
    }

    public static void main(String[] args) {
        FinalVariables finalVariables = new FinalVariables();

//        finalVariables.NUMERO_MAXIMO = 20;
//        finalVariables.MENSAGEM = "Tentei mudar";

        finalVariables.imprimirValoresFinais();
    }
}
