package hashmap;

// Drill 5 - Can build word from letters
// Given a word and a string of available letters, return true if the word can be
// built using each available letter at most once. Extra letters are allowed.
// Both strings contain only lowercase letters.
// Example: ("aab", "baca") -> true
// Example: ("aab", "abc") -> false (the word needs two 'a', but there is only one)

import java.util.HashMap;
import java.util.Map;

public class CanBuildWordFromLetters {

    public boolean canBuild(String word, String letters) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < letters.length(); i++) {
            char c = letters.charAt(i);
            int letterCount = map.getOrDefault(c, 0); // Ler
            int letterTotal = letterCount + 1; // Calcular
            map.put(c, letterTotal); // Gravar
        }
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int letterCount = map.getOrDefault(c, 0);
            if (letterCount == 0) {
                return false;
            }
            map.put(c, letterCount - 1);
            }
        return true; // placeholder so the class compiles
    }

    public static void main(String[] args) {
        CanBuildWordFromLetters solution = new CanBuildWordFromLetters();

        // Test 01: enough letters, with one extra
        boolean result01 = solution.canBuild("aab", "baca");
        System.out.println(result01); // true

        // Test 02: the letter exists, but not enough times
        boolean result02 = solution.canBuild("aab", "abc");
        System.out.println(result02); // false

        // Test 03: same letters in a different order
        boolean result03 = solution.canBuild("cat", "act");
        System.out.println(result03); // true

        // Test 04: word longer than letters
        boolean result04 = solution.canBuild("abcd", "abc");
        System.out.println(result04); // false

        // Test 05: empty word
        boolean result05 = solution.canBuild("", "abc");
        System.out.println(result05); // true

        // Test 06: empty letters
        boolean result06 = solution.canBuild("a", "");
        System.out.println(result06); // false

        // Test 07: both empty
        boolean result07 = solution.canBuild("", "");
        System.out.println(result07); // true

        // Test 08: one letter, same letter
        boolean result08 = solution.canBuild("a", "a");
        System.out.println(result08); // true

        // Test 09: all letters equal, enough of them
        boolean result09 = solution.canBuild("aaa", "aaaa");
        System.out.println(result09); // true

        // Test 10: all letters equal, one short
        boolean result10 = solution.canBuild("aaaa", "aaa");
        System.out.println(result10); // false

        // Test 11: letter that does not appear in letters at all
        boolean result11 = solution.canBuild("abz", "abc");
        System.out.println(result11); // false

        // Test 12: many extra letters
        boolean result12 = solution.canBuild("ab", "zzbyya");
        System.out.println(result12); // true
    }
}
