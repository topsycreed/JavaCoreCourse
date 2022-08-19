package floatingPointTypes;

import org.junit.jupiter.api.Test;

public class DoubleTests {

    @Test
    void doubleTest() {
        double zero = 0.0;
        double one = 1;
        double negative = -1.123;
        double eps = 5e-3;
        double maxFloatPart = 1.12345678901234567890;

        System.out.println(zero); // 0.0
        System.out.println(one); // 1.0
        System.out.println(negative); // -1.123
        System.out.println(eps); // 0.005
        System.out.println(maxFloatPart); // 1.1234567890123457
        System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
        System.out.println(Double.MIN_VALUE); // 4.9E-324
    }

    @Test
    void arithmeticOperations() {
        System.out.println("Sum: " + (1.1 + 2.2)); // 3.3000000000000003
        System.out.println("Subtraction: " + (2.2 - 2)); // 0.20000000000000018
        System.out.println("Multiplication: " + (1.5 * 2.5)); // 3.75
        System.out.println("Division: " + (3.0 / 2.0)); // 1.5
        System.out.println("integer division: " + (3 / 2)); // 1
    }
}
