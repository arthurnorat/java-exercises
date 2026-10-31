package classes;

public class Bolo {

    int quantidadeDeAcucar;

    static void main(String[] args) {
        Bolo boloDeChocolate = new Bolo();
        boloDeChocolate.quantidadeDeAcucar = 200;

        Bolo boloDeBaunilha = new Bolo();
        boloDeBaunilha.quantidadeDeAcucar = 150;

        System.out.println("A quantidade de açúcar no bolo de chocolate é " + boloDeChocolate.quantidadeDeAcucar + " gramas.");
        System.out.println("A quantidade de açúcar no bolo de baunilha é " + boloDeBaunilha.quantidadeDeAcucar + " gramas.");
    }
}
