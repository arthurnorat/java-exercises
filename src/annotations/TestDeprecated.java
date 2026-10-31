package annotations;

class InformaRegrasDeprecated {

    @Deprecated
    public void mostrarRegrasParaAposentadoria() {
        System.out.println("Regras para Aposentadoria");
    }

    public void mostrarNovasRegrasParaAposentadoria() {
        System.out.println("NOVAS Regras para Aposentadoria");
    }

    public void chamarMetodoObsoletoNaMesmaClasse(){
        mostrarRegrasParaAposentadoria();
    }
}

public class TestDeprecated {

    public static void main(String[] args) {

        InformaRegrasDeprecated regras = new InformaRegrasDeprecated();

        regras.chamarMetodoObsoletoNaMesmaClasse();
    }
}