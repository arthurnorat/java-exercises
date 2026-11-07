package hashset;

// Drill 2 - First repeated character
// Reading the string from left to right, return the character whose second
// occurrence comes first. If no character repeats, return '_'.
// Example: "abcbad" -> 'b' ('b' repeats at index 3, before 'a' repeats at index 4)

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {
    public char firstRepeated(String text) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!set.add(c)) {
                return c;
            }
        }
        return '_';
    }

    public static void main(String[] args) {
        FirstRepeatedCharacter solution = new FirstRepeatedCharacter();

        // Test 01: 'b' repeats before 'a' does
        char result01 = solution.firstRepeated("abcbad");
        System.out.println(result01); // b

        // Test 02: empty string
        char result02 = solution.firstRepeated("");
        System.out.println(result02); // _

        // Test 03: one character
        char result03 = solution.firstRepeated("a");
        System.out.println(result03); // _

        // Test 04: all characters equal
        char result04 = solution.firstRepeated("zzzz");
        System.out.println(result04); // z

        // Test 05: no repeated characters
        char result05 = solution.firstRepeated("abcd");
        System.out.println(result05); // _

        // Test 06: the repeat is the last character
        char result06 = solution.firstRepeated("abcda");
        System.out.println(result06); // a

        // Test 07: 'a' appears first, but 'b' is the first to repeat
        char result07 = solution.firstRepeated("abba");
        System.out.println(result07); // b
    }
}
