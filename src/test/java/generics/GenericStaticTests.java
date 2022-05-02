package generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericStaticTests {

    @Test
    void genericStringTest() {
        String s = "text";
        Assertions.assertEquals(s, StaticGenericMethodClass.doSomething(s));
    }

    @Test
    void arrayLengthTest() {
        Integer[] array1 = { 1, 2, 3, 4 };
        Character[] array2 = { '1', '2', '3', '4' };
        int len1= StaticGenericMethodClass.length(array1);
        int len2= StaticGenericMethodClass.length(array2);
        Assertions.assertEquals(len1, len2);
    }

    @Test
    void printTest() {
        Boolean[] booleans = {true, false, true, false};
        Double[] doubles = {1.25, 2.14, 3.14};
        StaticGenericMethodClass.print(booleans);
        StaticGenericMethodClass.print(doubles);
    }

    @Test
    void compareTest() {
        String a = "a";
        String b = "b";
        char c = 'c';
        StaticGenericMethodClass.method(a, b);
        StaticGenericMethodClass.method(a, c);
    }
}
