package collections;

import org.junit.jupiter.api.Test;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTests {

    @Test
    void treeSetTest() {
        SortedSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(13);
        numbers.add(21);
        numbers.add(17);

        System.out.println(numbers);//[10, 13, 15, 17, 21]
        System.out.println(numbers.headSet(15)); // [10, 13]
        System.out.println(numbers.first()); // minimum is 10
        System.out.println(numbers.last());  // maximum is 21
        System.out.println(numbers.comparator());//null
    }
}
