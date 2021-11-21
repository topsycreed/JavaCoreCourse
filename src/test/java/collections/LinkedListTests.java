package collections;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTests {

    @Test
    void linkedListTest() {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        print(numbers);
    }

    private void print(List<?> list) {//<?> wildcard allow us to have the same method for all types
        System.out.println("--------begin---------");
        for (Object listElement : list) {
            System.out.println(listElement);
        }
        System.out.println("---------end----------");
    }
}
