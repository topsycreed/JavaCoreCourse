package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListTests {

    @Test
    void listTest() {
        //ArrayList<String> list = new ArrayList<>();//It's better to create using List, not an implementation
        List<String> subjects = new ArrayList<>();//<String> it's diamond operand to assign the type of an objects inside collection
        subjects.add("Math");
        subjects.add("Geometry");
        subjects.add("Physics");
        print(subjects);
        System.out.println("Element on the position 1 = " + subjects.get(1));
        subjects.set(1, "Music");
        print(subjects);
        subjects.add("Math");
        subjects.add("Geometry");
        subjects.add("Physics");
        subjects.add("Math");
        subjects.add("Geometry");
        subjects.add("Physics");
        print(subjects);
        System.out.println("First Math position = " + subjects.indexOf("Math"));
        System.out.println("Last Math position = " + subjects.lastIndexOf("Math"));
        print(subjects.subList(0,3));
    }

    private void print(List<?> list) {//<?> wildcard allow us to have the same method for all types
        System.out.println("--------begin---------");
        for (Object listElement : list) {
            System.out.println(listElement);
        }
        System.out.println("---------end----------");
    }

    @Test
    void immutableListTest() {
        List<String> emptyList = List.of(); // 0 elements
        List<String> names = List.of("Larry", "Kenny", "Sabrina"); // 3 elements
        List<Integer> numbers = List.of(0, 1, 1, 2, 3, 5, 8, 13);  // 8 elements

        print(names);
        print(numbers);

        //You cannot modify immutable list! No add, delete, clear or replace methods allowed!
        //names.clear();//java.lang.UnsupportedOperationException
        //numbers.add(16);//java.lang.UnsupportedOperationException
    }

    @Test
    void listEquality() {
        System.out.println(Objects.equals(List.of(1, 2, 3), List.of(1, 2, 3)));    // true
        System.out.println(Objects.equals(List.of(1, 2, 3), List.of(1, 3, 2)));    // false
        System.out.println(Objects.equals(List.of(1, 2, 3), List.of(1, 2, 3, 1))); // false

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(Objects.equals(numbers, List.of(1, 2, 3))); // true
    }
}
