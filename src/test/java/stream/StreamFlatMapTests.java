package stream;

import org.junit.jupiter.api.Test;
import streamAPI.Book;
import streamAPI.Month;
import streamAPI.User;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFlatMapTests {

    @Test
    void mapToObjTest() {
        List<Month> months = IntStream.rangeClosed(1, 12)
                .mapToObj(Month::new)
                .collect(Collectors.toList());
        System.out.println(months);
    }

    @Test
    void flatMapTest() {
        List<Book> javaBooks = List.of(
                new Book("Java EE 7 Essentials", 2013, List.of("Arun Gupta")),
                new Book("Algorithms", 2011, List.of("Robert Sedgewick", "Kevin Wayne")),
                new Book("Clean code", 2014, List.of("Robert Martin"))
        );

        List<String> authors = javaBooks.stream()
                .flatMap(book -> book.getAuthors().stream())
                .collect(Collectors.toList());

        System.out.println(authors); // [Arun Gupta, Robert Sedgewick, Kevin Wayne, Robert Martin]
    }

    @Test
    void flatMapTest2() {
        List<List<String>> list = Arrays.asList(
                List.of("a"),
                List.of("b")
        );
        System.out.println(list); //[[a], [b]] two separate lists!

        System.out.println(list
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())); //[a, b] one single list!
    }

    @Test
    void peekTest2() {
        Stream<User> userStream = Stream.of(new User("Alice"), new User("Bob"), new User("Chuck"));
        userStream
                .map(u -> u.getName().toLowerCase())
                .forEach(System.out::println);

        Stream<User> userStream2 = Stream.of(new User("Alice"), new User("Bob"), new User("Chuck"));
        userStream2
                .peek(u -> u.setName(u.getName().toLowerCase()))
                .forEach(System.out::println);
    }

    @Test
    void peekTest() {
        List<String> list = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
