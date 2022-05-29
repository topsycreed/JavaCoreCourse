package stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalTests {

    @Test
    void lambdaTest() {

        BiFunction<Integer, Integer, Integer> mult = (x, y) -> x * y;

        // if it has only one argument "()" are optional
        Function<Integer, Integer> adder1 = x -> x + 1;

        // with multiple statements
        Function<Integer, Integer> adder2 = x -> {
            x += 2;
            x += 3;
            return x;
        };

        int result1 = mult.apply(5, 3);
        int result2 = adder1.apply(1);
        int result3 = adder2.apply(0);
        Assertions.assertEquals(result1, 15);
        Assertions.assertEquals(result2, 2);
        Assertions.assertEquals(result3, 5);
    }

    @Test
    void lambdaInMethodTest() {
        Function<String, Integer> f = s -> s.length();
        // passing with a reference
        printResultOfLambda(f);
        // passing without a reference
        printResultOfLambda(s -> s.length());
    }

    @Test
    void closureLambda() {
        final String hello = "Hello, ";
        Function<String, String> helloFunction = (name) -> hello + name;

        System.out.println(helloFunction.apply("Gennadii"));
        System.out.println(helloFunction.apply("Maya"));
    }

    @Test
    void predicateTest() {
        Predicate<Character> isDigit = Character::isDigit;
        Boolean check1 = isDigit.test('h');
        Boolean check2 = isDigit.test('5');
        Assertions.assertEquals(check1, false);
        Assertions.assertEquals(check2, true);
    }

    private static void printResultOfLambda(Function<String, Integer> function) {
        System.out.println("Result of function: " + function.apply("HELLO WORLD!"));
    }
}
