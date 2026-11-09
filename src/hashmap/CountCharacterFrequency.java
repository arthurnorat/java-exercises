package hashmap;

// Drill 3 - Count character frequency
// Given a string, return a map from each character to how many times it appears.
// Example: "banana" -> b=1, a=3, n=2

import java.util.HashMap;
import java.util.Map;

public class CountCharacterFrequency {

    public Map<Character, Integer> countChars(String text) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int characterCount = map.getOrDefault(c, 0); // Ler
            int characterTotal = characterCount + 1; // Calcular
            map.put(c, characterTotal); // Gravar
        }
    return map; // Devolver
    }

    public static void main(String[] args) {
        CountCharacterFrequency solution = new CountCharacterFrequency();

        // Test 01: repeated characters
        Map<Character, Integer> result01 = solution.countChars("banana");
        System.out.println(result01.get('b')); // 1
        System.out.println(result01.get('a')); // 3
        System.out.println(result01.get('n')); // 2
        System.out.println(result01.size()); // 3

        // Test 02: character that is not in the string
        Map<Character, Integer> result02 = solution.countChars("banana");
        System.out.println(result02.get('z')); // null

        // Test 03: empty string
        Map<Character, Integer> result03 = solution.countChars("");
        System.out.println(result03.size()); // 0

        // Test 04: one character
        Map<Character, Integer> result04 = solution.countChars("x");
        System.out.println(result04.get('x')); // 1
        System.out.println(result04.size()); // 1

        // Test 05: all characters equal
        Map<Character, Integer> result05 = solution.countChars("aaaa");
        System.out.println(result05.get('a')); // 4
        System.out.println(result05.size()); // 1

        // Test 06: no repeated characters
        Map<Character, Integer> result06 = solution.countChars("abc");
        System.out.println(result06.get('a')); // 1
        System.out.println(result06.get('b')); // 1
        System.out.println(result06.get('c')); // 1
        System.out.println(result06.size()); // 3

        // Test 07: uppercase and lowercase are different characters
        Map<Character, Integer> result07 = solution.countChars("aA");
        System.out.println(result07.get('a')); // 1
        System.out.println(result07.get('A')); // 1
        System.out.println(result07.size()); // 2
    }
}
