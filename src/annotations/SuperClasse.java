package annotations;

public class SuperClasse {
    public void imprime() {
        System.out.printf("Imprime%n");
    }
}

class MinhaClasse extends SuperClasse {

    @Override
    public void imprime() {
        System.out.printf("Imprime diferente%n");
    }

    public static void main(String[] args) {
        MinhaClasse minhaClasse = new MinhaClasse();
        minhaClasse.imprime();
    }
}