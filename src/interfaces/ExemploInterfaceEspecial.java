package interfaces;

public interface ExemploInterfaceEspecial {
    // Método abstrato
    void metodoAbstrato();

    // Método default
    default void metodoDefault(){
        System.out.printf("Este é um método default na interface.%n");
    }

    // Método static
    static void metodoStatic() {
        System.out.printf("Este é um método static na interface.%n");
    }
}

class TesteInterfaceEspecial implements ExemploInterfaceEspecial {

    @Override
    public void metodoAbstrato() {
        System.out.println("Implementação do método abstrato");
    }

    @Override
    public void metodoDefault() {
        ExemploInterfaceEspecial.super.metodoDefault();
    }

    static void main(String[] args) {
        TesteInterfaceEspecial exemploClasse = new TesteInterfaceEspecial();
        exemploClasse.metodoAbstrato();
        exemploClasse.metodoDefault();
        ExemploInterfaceEspecial.metodoStatic(); // Esse pode ser chamado a partir da interface
    }
}


