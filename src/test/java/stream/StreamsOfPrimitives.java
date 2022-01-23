package stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsOfPrimitives {

    @Test
    void primitives() {
        //Using of method
        IntStream ints = IntStream.of(1, 2, 3);
        LongStream longs = LongStream.of(1, 2, 3);
        DoubleStream doubles = DoubleStream.of(12.2, 18.1);

        //Using array of primitives
        IntStream numbers = Arrays.stream(new int[]{1, 2, 3});

        //Using range() and rangeClosed()
        IntStream numbers2 = IntStream.range(10, 15); // from 10 (incl) to 15 (excl)
        LongStream longs2 = LongStream.rangeClosed(1_000_000, 2_000_000); // it includes both borders

        //From String using chars()
        IntStream stream = "aibohphobia".chars(); // It returns IntStream!

        //Using default methods: generate, iterate, concat
        DoubleStream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);

        DoubleStream.iterate(1, d -> d + 0.5)
                .limit(5)
                .forEach(System.out::println);

        DoubleStream stream1 = DoubleStream.of(2.2, 4.3, 6.4);
        DoubleStream stream2 = DoubleStream.of(1.5, 3.6, 5.7);
        DoubleStream.concat(stream1, stream2)
                .forEach(System.out::println);
    }

    @Test
    void additionalOperations() {
        int[] numbers = { 10, 11, 25, 14, 22, 21, 18 };

        int max = IntStream.of(numbers).max().getAsInt();
        System.out.println(max); // 25

        int min = IntStream.of(numbers).min().getAsInt();
        System.out.println(min); // 10

        double avg = IntStream.of(numbers).average().orElse(0.0);
        System.out.println(avg); // 17.2857...

        int sum = IntStream.of(numbers).sum();
        System.out.println(sum); // 121

        IntSummaryStatistics stat = IntStream.rangeClosed(1, 55_555).summaryStatistics();

        System.out.printf("Count: %d, Min: %d, Max: %d, Avg: %.1f%n",
                stat.getCount(), stat.getMin(), stat.getMax(), stat.getAverage());
    }

    @Test
    void transformingStreams() {
        //Transforming a primitive type stream to another one
        IntStream.of(1, 2, 3, 4)
                .asDoubleStream()
                .forEach(System.out::println); // it prints doubles 1.0, 2.0, ...

        IntStream.of(1, 2, 3, 4)
                .asLongStream()
                .forEach(System.out::println); // it prints long 1, 2, ...

        //Transforming a primitive type stream into the generalized stream
        Stream<Integer> streamOfNumbers = IntStream.range(1, 10).boxed();

        //Transforming a generalized stream into a stream of primitives
        List<Integer> numbers = List.of(1, 5, 9);
        int sum = numbers.stream().mapToInt(i -> i).sum(); // 15
    }
}
