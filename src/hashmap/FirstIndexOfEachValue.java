package hashmap;

// Drill 4 - First index of each value
// Given an int array, return a map from each value to the index of its first occurrence.
// Example: [5, 3, 5, 1] -> 5=0, 3=1, 1=3

import java.util.HashMap;
import java.util.Map;

public class FirstIndexOfEachValue {

    public Map<Integer, Integer> firstIndexes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!map.containsKey(num)) {
                map.put(num, i);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        FirstIndexOfEachValue solution = new FirstIndexOfEachValue();

        // Test 01: one repeated value
        Map<Integer, Integer> result01 = solution.firstIndexes(new int[]{5, 3, 5, 1});
        System.out.println(result01.get(5)); // 0
        System.out.println(result01.get(3)); // 1
        System.out.println(result01.get(1)); // 3
        System.out.println(result01.size()); // 3

        // Test 02: value that is not in the array
        Map<Integer, Integer> result02 = solution.firstIndexes(new int[]{5, 3, 5, 1});
        System.out.println(result02.get(9)); // null

        // Test 03: empty array
        Map<Integer, Integer> result03 = solution.firstIndexes(new int[]{});
        System.out.println(result03.size()); // 0

        // Test 04: one element
        Map<Integer, Integer> result04 = solution.firstIndexes(new int[]{7});
        System.out.println(result04.get(7)); // 0
        System.out.println(result04.size()); // 1

        // Test 05: all values equal
        Map<Integer, Integer> result05 = solution.firstIndexes(new int[]{2, 2, 2, 2});
        System.out.println(result05.get(2)); // 0
        System.out.println(result05.size()); // 1

        // Test 06: no repeated values
        Map<Integer, Integer> result06 = solution.firstIndexes(new int[]{4, 5, 6});
        System.out.println(result06.get(4)); // 0
        System.out.println(result06.get(5)); // 1
        System.out.println(result06.get(6)); // 2
        System.out.println(result06.size()); // 3

        // Test 07: negative values and zero
        Map<Integer, Integer> result07 = solution.firstIndexes(new int[]{-1, 0, -1, 0});
        System.out.println(result07.get(-1)); // 0
        System.out.println(result07.get(0)); // 1
        System.out.println(result07.size()); // 2
    }
}
