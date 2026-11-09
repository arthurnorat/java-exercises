package hashmap;

// Drill 3b - Count word frequency
// Given an array of words, return a map from each word to how many times it appears.
// Example: ["go", "java", "go", "sql", "go"] -> go=3, java=1, sql=1

import java.util.HashMap;
import java.util.Map;

public class CountWordFrequency {

    public Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int wordCount = map.getOrDefault(word, 0); // Ler
            int wordTotal = wordCount + 1; // Calcular
            map.put(word, wordTotal); // Gravar
        }
        return map; // Devolver
    }

    public static void main(String[] args) {
        CountWordFrequency solution = new CountWordFrequency();

        // Test 01: repeated words
        Map<String, Integer> result01 = solution.countWords(new String[]{"go", "java", "go", "sql", "go"});
        System.out.println(result01.get("go")); // 3
        System.out.println(result01.get("java")); // 1
        System.out.println(result01.get("sql")); // 1
        System.out.println(result01.size()); // 3

        // Test 02: word that is not in the array
        Map<String, Integer> result02 = solution.countWords(new String[]{"go", "java"});
        System.out.println(result02.get("python")); // null

        // Test 03: empty array
        Map<String, Integer> result03 = solution.countWords(new String[]{});
        System.out.println(result03.size()); // 0

        // Test 04: one word
        Map<String, Integer> result04 = solution.countWords(new String[]{"map"});
        System.out.println(result04.get("map")); // 1
        System.out.println(result04.size()); // 1

        // Test 05: all words equal
        Map<String, Integer> result05 = solution.countWords(new String[]{"set", "set", "set"});
        System.out.println(result05.get("set")); // 3
        System.out.println(result05.size()); // 1

        // Test 06: no repeated words
        Map<String, Integer> result06 = solution.countWords(new String[]{"a", "b", "c"});
        System.out.println(result06.get("a")); // 1
        System.out.println(result06.get("b")); // 1
        System.out.println(result06.get("c")); // 1
        System.out.println(result06.size()); // 3

        // Test 07: uppercase and lowercase are different words
        Map<String, Integer> result07 = solution.countWords(new String[]{"Go", "go", "go"});
        System.out.println(result07.get("Go")); // 1
        System.out.println(result07.get("go")); // 2
        System.out.println(result07.size()); // 2
    }
}
