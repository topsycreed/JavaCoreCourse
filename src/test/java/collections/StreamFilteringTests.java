package collections;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilteringTests {

    @Test
    void numbersTest() {
        List<Integer> primeNumbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31);

        List<Integer> filteredPrimeNumbers = primeNumbers.stream() // create a stream from the list
                .filter(n -> n >= 11 && n <= 23) // filter elements
                .collect(Collectors.toList());   // collect elements in a new list
    }

    @Test
    void numbersWithPredicateTest() {
        List<Integer> primeNumbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31);

        Predicate<Integer> between11and23 = n -> n >= 11 && n <= 23;  // instantiate the predicate

        List<Integer> filteredPrimeNumbers = primeNumbers.stream() // create a stream from the list
                .filter(between11and23)        // pass the predicate to the filter method
                .collect(Collectors.toList()); // collect elements in a new list

        System.out.println(filteredPrimeNumbers);//[11, 13, 17, 19, 23]
    }

    @Test
    void multipleFilters() {
        List<String> programmingLanguages = Arrays.asList("Java", "", "scala", "Kotlin", "", "clojure");

        long count = programmingLanguages.stream()
                .filter(lang -> lang.length() > 0) // consider only non-empty strings
                .filter(lang -> Character.isUpperCase(lang.charAt(0)))
                .count(); // count suitable languages
        System.out.println(count);//2

        //the same as
        //filter(lang -> lang.length() > 0 && Character.isUpperCase(lang.charAt(0)))
    }
}
