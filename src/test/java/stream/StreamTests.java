package stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class StreamTests {

    @Test
    void simpleStream() {
        List<Integer> numbers = List.of(1, 4, 7, 6, 2, 9, 7, 8);

        long count = 0;
        for (int number : numbers) {
            if (number > 5) {
                count++;
            }
        }
        System.out.println(count); // 5

        long count2 = numbers.stream()
                .filter(number -> number > 5)
                .count(); // 5
        System.out.println(count2); // 5
    }

    @Test
    void ComplexStream() {
        List<String> companies = List.of(
                "Google", "Amazon", "Samsung",
                "GOOGLE", "amazon", "Oracle"
        );

        companies.stream()
                .map(String::toUpperCase) // transform each name to the upper case
                .distinct() // intermediate operation: keep only unique words
                .forEach(x -> System.out.println(x)); // print every company

        companies.stream()
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);//with method reference -> increased readability of code
    }
}
