package collections;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ExemploList {
    public static void main(String[] args) {

        // Declaração: interface List, implementação ArrayList
        List<String> lista = new ArrayList<>();

        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        // Verificando a existência de um elemento
        System.out.println("Contém Java? " + lista.contains("Java"));

        // Criando uma segunda lista com Arrays.asList()
        List<String> outraLista = Arrays.asList("JavaScript", "Ruby");

        //  Adicionando TODOS os elementos de outra lista na principal
        lista.addAll(outraLista);
        System.out.println("Lista completa: " + lista);
        // [Java, Python, C++, JavaScript, Ruby] - ordem preservada

        // Removendo por valor
        lista.remove("Python");

        // Imprimir --> [Java, C++, JavaScript, Ruby]
        System.out.println("Lista completa: " + lista);

        // Acessando pelo índice - exclusivo de List
        String elemento = lista.get(2); // Obtém o terceiro elemento da lista
        System.out.println("Elemento do índice 2: " + elemento);

        // Limpando a lista
        lista.clear();
        System.out.println("Lista após clear: " + lista);



    }
}
