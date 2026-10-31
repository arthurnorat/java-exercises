package interfaces;

interface SerVivo {
    void respirar();
}

interface Animal extends SerVivo {

    // Não pode modificar o conteúdo do atributo
    public static final String DESCRICAO = "Animal é um ser vivo importante";

    // Todos os métodos devem ser o mais acessível possível, ou seja, public.
    // O compilador já adiciona
    // A palavra abstract é opcional
    public abstract void fazerSom(); // Método abstrato, porque ele não tem corpo
}

// Classe Cachorro que implementa a interface animal
class Cachorro implements Animal {

    @Override // Override obrigatório. Tem que fazer uma implementação dele
    public void fazerSom() {
        System.out.printf("O cachorro faz: Au Au!%n");
    }

    @Override
    public void respirar() {
        System.out.printf("O cachorro respira.%n");
    }
}

class Gato implements Animal {

    @Override
    public void fazerSom() {
        System.out.printf("O gato faz: Miau Miau!%n");
    }

    @Override
    public void respirar() {
        System.out.printf("O gato respira.%n");
    }
}

class TestInterface {
    static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();
        cachorro.respirar();

        Gato gato = new Gato();
        gato.fazerSom();
        gato.respirar();
    }
}