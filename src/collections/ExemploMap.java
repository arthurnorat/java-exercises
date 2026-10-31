package collections;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {

        // Generics com DOIS tipos: <TipoChave, TipoValor>
        Map<String, Integer> mapa = new HashMap<>();

        // Adicionando pares — método put(), não add()
        mapa.put("Java", 20);
        mapa.put("Python", 10);
        mapa.put("C++", 15);

        // Verificando se uma CHAVE existe — containsKey()
        System.out.println("Contém 'Java'? " + mapa.containsKey("Java")); // true

        // Obtendo o valor associado a uma chave - get()
        System.out.println("Valor associado a 'Java': " + mapa.get("Java")); //  20

        // Adicionando mais elementos
        mapa.put("JavaScript", 25);
        mapa.put("Ruby", 5);

        // Imprime sem ordem --> {Java=20, Python=10, C++=15, JavaScript=25, Ruby=5}
        System.out.println("Mapa completo: " + mapa);

        // Removendo por CHAVE
        mapa.remove("Python");

        // Mapa após remoção do elemento --> {Java=20, C++=15, JavaScript=25, Ruby=5}
        System.out.println("Mapa completo: " + mapa);

        // Atualizando valor — put() com chave existente SUBSTITUI o valor
        mapa.put("Java", 30);
        System.out.println("Mapa após atualização: " + mapa);

        // Tamanho
        System.out.println("Tamanho: " + mapa.size() );

        // Limpando o mapa
        mapa.clear();
        System.out.println("Mapa após limpeza: " + mapa);
    }
}
