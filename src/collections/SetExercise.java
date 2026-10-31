package collections;

import java.util.Set;
import java.util.HashSet;

public class SetExercise {
    public static void main(String[] args) {
        Set<Integer> numerosInteiros = new HashSet<>();
        numerosInteiros.add(3);
        numerosInteiros.add(7);
        numerosInteiros.add(11);
        numerosInteiros.add(17);

        System.out.println(numerosInteiros.contains(71));
        numerosInteiros.remove(7);
        System.out.println(numerosInteiros);
    }
}
