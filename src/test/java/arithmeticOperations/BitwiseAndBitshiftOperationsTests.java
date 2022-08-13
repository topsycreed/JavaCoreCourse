package arithmeticOperations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BitwiseAndBitshiftOperationsTests {

    @Test
    void bitwiseOperationsTest() {
        int first = 15;  // binary format 1111
        int second = 10; // binary format 1010
        Assertions.assertEquals(10, first & second); // 1111 & 1010 = 1010, the result is 10
        Assertions.assertEquals(15, first | second); // 1111 | 1010 = 1111, the result is 15
        Assertions.assertEquals(5, first ^ second);  // 1111 ^ 1010 = 0101, the result is 5
        Assertions.assertEquals(-11, ~second);              // ~1010 => 000000000000000000000000001010 = 11111111111111111111111111110101, the result is -11
        System.out.println(Integer.toBinaryString(second));
        System.out.println(Integer.toBinaryString(~second));
    }

    @Test
    void bitshiftOperationsTest() {
        int value = 25;  // binary: 0001 1001

        Assertions.assertEquals(50, value << 1); // 0011 0010, the result is 50
        Assertions.assertEquals(6, value >> 2); // 0000 0110, the result is 6
        Assertions.assertEquals(12, value >>> 1);  // 0000 1100, the result is 12
    }
}
