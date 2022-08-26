package relationalOperators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RelationalOperatorsTests {

    @Test
    void relationalOperatorsTest() {
        Assertions.assertTrue(1 == 1);
        Assertions.assertFalse(1 != 1);
        Assertions.assertTrue(2 > 1);
        Assertions.assertTrue(1 >= 1);
        Assertions.assertTrue(1 < 3);
        Assertions.assertTrue(1 <= 2);
    }

    @Test
    void joiningRelationalOperatorsTest() {
        int min = 0;
        int max = 9;
        int number = new Random().nextInt(max - min + 1) + min;
        System.out.println(number);
        if (number == 1 || number == 3 || number == 5 || number == 7 || number == 9) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }
        if (number <= min - 1 || number >= max + 1) {
            System.out.println("It's impossible!");
        }
    }
}
