package arithmeticOperations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticOperationsTests {

    @Test
    void binaryArithmeticOperationsTest() {
        Assertions.assertEquals(2, 1 + 1);
        Assertions.assertEquals(1, 2 - 1);
        Assertions.assertEquals(6, 2 * 3);
        Assertions.assertEquals(2, 5 / 2);
        Assertions.assertEquals(1, 5 % 2);
        Assertions.assertEquals(0, 4 % 2);
    }

    @Test
    void unaryArithmeticOperationsTest() {
        Assertions.assertEquals(1, +1);
        Assertions.assertEquals(-2, -2);
    }

    @Test
    void precedenceOrderTest() {
        Assertions.assertEquals(-4, 2 * -3 + 2);
        Assertions.assertEquals(-2, 2 * (-3 + 2));
    }
}
