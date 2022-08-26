package incrementDecrement;

import org.junit.jupiter.api.Test;

public class IncrementDecrementTests {

    @Test
    void incDecTest() {
        int a = 1;
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);

        a += 2;
        System.out.println(a);

        a -= 1;
        System.out.println(a);
    }

    @Test
    void prefPostf() {
        int a = 1;
        int b = --a;
        System.out.println(a);
        System.out.println(b);

        b = a++;
        System.out.println(a);
        System.out.println(b);
    }

    @Test
    void exampleOfUsage() {
        String city = "Berlin";
        String res = "";
        for (int i = 0; i < city.length(); i++) {
            String value = city.substring(i, i + 1).toUpperCase();
            res += value;
        }
        System.out.println(res);
    }
}
