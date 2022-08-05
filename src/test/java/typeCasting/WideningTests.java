package typeCasting;

import org.junit.jupiter.api.Test;

public class WideningTests {

    @Test
    void wideningTest() {
        int num = 100;
        long bigNum = num; // 100

        System.out.println(num);
        System.out.println(bigNum);

        bigNum = 100_000_000L;
        double bigFraction = bigNum; // 1.0E8

        System.out.println(bigNum);
        System.out.println(bigFraction);

        short shortNum = 100;
        num = shortNum; // 100

        System.out.println(shortNum);
        System.out.println(num);

        char ch = '?';
        int code = ch; //63

        System.out.println(ch);
        System.out.println(code);
    }
}
