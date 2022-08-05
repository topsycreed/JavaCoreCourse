package typeCasting;

import org.junit.jupiter.api.Test;

public class ExplicitCastingTest {

    @Test
    void explicitTest() {
        double d = 2.00003;

        // it loses the fractional part
        long l =  (long) d; // 2

        // requires explicit casting because long is wider than int
        int i = (int) l; // 2

        // requires explicit casting because the result is long (indicated by L)
        int val = (int) (3 + 2L); // 5

        // casting from a long literal to char
        char ch = (char) 55L; // '7'

        long bigNum = 100_000_000_000_000L;
        // it will truncate the value because of type overflow
        int n = (int) bigNum; // 276447232
    }
}
