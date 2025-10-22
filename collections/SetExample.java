package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        //set
        // unique elements
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(4);
        set.add(4);
        set.add(4);
        set.add(12);
        set.add(5);

        System.out.println(set);
        set.remove(12);
        System.out.println(set);
    }
}
