package typeCasting;

import org.junit.jupiter.api.Test;

public class OperationsCastingTests {

    @Test
    void operationTest() {
        int a = 1;
        double  b = 1.5;
        System.out.println(a + b);

        System.out.println((int) (a + b));
    }
}
