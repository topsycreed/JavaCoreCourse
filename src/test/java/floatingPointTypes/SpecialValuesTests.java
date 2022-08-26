package floatingPointTypes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpecialValuesTests {

    @Test
    void infinityTests() {
        double posInf = Double.POSITIVE_INFINITY;
        double posInf2 = 1.0 / 0.0;
        System.out.println(posInf);
        System.out.println(posInf2);
        System.out.println(posInf + 100_000);
        Assertions.assertEquals(posInf, posInf2);
        Assertions.assertEquals(posInf, posInf + 100_000);

        double negInf = Double.NEGATIVE_INFINITY;
        double negInf2 = -1.0 / 0.0;
        System.out.println(negInf);
        System.out.println(negInf2);
        System.out.println(negInf * 100_000);
        Assertions.assertEquals(negInf, negInf2);
        Assertions.assertEquals(negInf, negInf2 + 100_000);

        Assertions.assertTrue(negInf < posInf);
    }

    @Test
    void notANumberTest() {
        double nan = Double.NaN;
        double nan2 =  0.0d / 0.0;
        System.out.println(nan);
        System.out.println(nan2);
        Assertions.assertEquals(nan, nan2);
        Assertions.assertEquals(nan, nan / 100);

        double nan3 = Double.NEGATIVE_INFINITY + Double.POSITIVE_INFINITY;
        double nan4 = Double.POSITIVE_INFINITY - Double.POSITIVE_INFINITY;
        System.out.println(nan3);
        System.out.println(nan4);
    }
}
