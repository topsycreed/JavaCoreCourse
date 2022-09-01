package conditionalStatement;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class TernaryOperatorTests {

    int min = 0;
    int max = 9;

    @Test
    void ternaryTest() {
        int number = new Random().nextInt(max - min + 1) + min;
        System.out.println(number);
        System.out.println(number % 2 == 0 ? "even" : "odd");
    }

    @Test
    void nestedTernaryTest() {
        int a = new Random().nextInt(max - min + 1) + min;
        int b = new Random().nextInt(max - min + 1) + min;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b ? "a equal b" : a > b ? "a more than b" : "a less than b");
    }
}
