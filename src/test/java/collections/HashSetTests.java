package collections;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTests {

    @Test
    void hashTest() {
        Set<String> names = new HashSet<>();
        names.add("Test");
        names.add("Gennady");
        names.add("Maya");
        names.add("Test");

        print(names);//there are only 1 Test - no duplicates. Besides, order is not the same!

        System.out.println(names.contains("Gennady"));//true
        System.out.println(names.contains("Test2"));//false
    }

    private void print(Set<?> set) {//<?> wildcard allow us to have the same method for all types
        System.out.println("--------begin---------");
        for (Object setElement : set) {
            System.out.println(setElement);
        }
        System.out.println("---------end----------");
    }
}
