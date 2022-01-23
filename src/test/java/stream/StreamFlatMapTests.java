package stream;

import org.junit.jupiter.api.Test;
import streamAPI.Book;
import streamAPI.Month;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFlatMapTests {

    @Test
    void mapToObjTest() {
        List<Month> months = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
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
}
