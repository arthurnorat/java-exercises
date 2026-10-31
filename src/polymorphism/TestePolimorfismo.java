package polymorphism;

abstract class Animal {
    public abstract void fazerSom();
}

class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        System.out.printf("O cachorro faz Au Au!%n");
    }
}

class Gato extends Animal {

    @Override
    public void fazerSom() {
        System.out.printf("O gato faz Miau Miau!%n");
    }
}

public class TestePolimorfismo {

    public static void main(String[] args) {

        // Declara com a classe pai e instancia com a classe filha
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        meuCachorro.fazerSom();
        meuGato.fazerSom();
    }
}