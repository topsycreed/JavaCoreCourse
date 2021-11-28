package collections;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ImmutableSetTests {

    @Test
    void immutableTest() {
        Set<String> emptySet = Set.of();
        Set<String> persons = Set.of("Larry", "Kenny", "Sabrina");
        Set<Integer> numbers = Set.of(100, 200, 300, 400);

        //The order of elements of immutable sets is not fixed
        System.out.println(emptySet); // []
        System.out.println(persons);  // [Kenny, Sabrina, Larry] or another order
        System.out.println(numbers);  // [100, 300, 200, 400] or another order
    }

    @Test
    void mutableFromImmutable() {
        // getting a mutable set from an immutable one
        Set<String> countries = new LinkedHashSet<>(List.of("India", "Japan", "Switzerland"));

        countries.addAll(List.of("India", "Germany", "Algeria"));
        System.out.println(countries ); // [India, Japan, Switzerland, Germany, Algeria]
        countries.retainAll(List.of("Italy", "Japan", "India", "Germany"));
        System.out.println(countries ); // [India, Japan, Germany]
        countries.removeAll(List.of("Japan", "Germany", "USA"));
        System.out.println(countries ); // [India]
    }
}
