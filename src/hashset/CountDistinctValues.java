package hashset;

// Drill 1 - Count distinct values
// Given an int array, return how many different values it contains.
// Example: [4, 2, 4, 7, 2] -> 3

import java.util.HashSet;
import java.util.Set;

public class CountDistinctValues {

    public int countDistinct(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        return set.size();
    }

    public static void main(String[] args) {
        CountDistinctValues solution = new CountDistinctValues();

        // Test 01: repeated values
        int result01 = solution.countDistinct(new int[]{4, 2, 4, 7, 2});
        System.out.println(result01); // 3

        // Test 02: empty array
        int result02 = solution.countDistinct(new int[]{});
        System.out.println(result02); // 0

        // Test 03: one element
        int result03 = solution.countDistinct(new int[]{9});
        System.out.println(result03); // 1

        // Test 04: all values equal
        int result04 = solution.countDistinct(new int[]{5, 5, 5, 5});
        System.out.println(result04); // 1

        // Test 05: no repeated values
        int result05 = solution.countDistinct(new int[]{1, 2, 3, 4});
        System.out.println(result05); // 4

        // Test 06: negative values and zero
        int result06 = solution.countDistinct(new int[]{-1, 0, -1, 0, 1});
        System.out.println(result06); // 3
    }
}
