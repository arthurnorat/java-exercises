package annotations;

public class ExemploDepreciado {
    @Deprecated
    public void metodoObsoleto() {
        System.out.printf("Método obsoleto");
    }
}

class PrincipalSuppressWarnings {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        ExemploDepreciado exemploDepreciado = new ExemploDepreciado();
        exemploDepreciado.metodoObsoleto();
    }
}