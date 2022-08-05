package typeCasting;

import org.junit.jupiter.api.Test;

public class AutomaticButLossyTests {

    @Test
    void lossyTest() {
        long bigLong =  1_200_000_002L;
        float bigFloat = bigLong; // 1.2E9 (= 1_200_000_000)

        System.out.println(bigLong);
        System.out.println(bigFloat);

        int bigInt = 2147483647;
        bigFloat = bigInt; // 2.14748365E9

        System.out.println(bigInt);
        System.out.println(bigFloat);
    }
}
