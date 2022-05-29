package boxingUnboxing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BoxingUnboxingTests {

    @Test
    void simple() {
        int primitive = 100;
        Integer reference = Integer.valueOf(primitive); // boxing
        int anotherPrimitive = reference.intValue();    // unboxing
    }

    @Test
    void automatic() {
        double primitiveDouble = 10.8;
        Double wrapperDouble = primitiveDouble;        // autoboxing
        double anotherPrimitiveDouble = wrapperDouble; // auto-unboxing
    }

    @Test
    void automaticNotWorks() {
        Long n1 = 10L;   // OK, assigning long to Long
        Integer n2 = 10; // OK, assigning int to Integer

        //Long n3 = 10;     // WRONG, assigning int to Long
        //Integer n4 = 10L; // WRONG assigning long to Integer
    }

    @Test
    void constructorWrappingDeprecated() {
        Integer number = new Integer("10012");   // an Integer from "10012"
        Float f = new Float("0.01");             // a Float from "0.01"
        Long longNumber = new Long("100000000"); // a Long from "100000000"
        Boolean boolVal = new Boolean("true");   // a Boolean from "true"
    }

    @Test
    void specialMethods() {
        Long longVal = Long.parseLong("1000");
        Long anotherLongVal = Long.valueOf("2000");
        Integer intVal = Integer.parseInt("123");
        Integer anotherIntVal = Integer.valueOf("234");
        Boolean boolValue = Boolean.parseBoolean("false");
        Boolean anotherBoolValue = Boolean.valueOf("true");
    }

    @Test
    void comparingWrappers() {
        long a1 = 1000L;
        long b1 = 1000L;

        Long a2 = Long.valueOf(a1);
        Long b2 = Long.valueOf(b1);

        Assertions.assertEquals(a1, b1);
        Assertions.assertEquals(a2, b2);
        Assertions.assertTrue(a1 == b1);
        Assertions.assertFalse(a2 == b2);
    }

    @Test
    void nullPointerException() {
        Long longVal = null;
        long primitiveLong = longVal; // It throws NPE

        long unboxed = longVal != null ? longVal : 0; // No NPE here

        Integer n1 = 50;
        Integer n2 = null;
        Integer result = n1 / n2; // It throws NPE
    }

    @Test
    void collectionsOnlyForWrappers() {
        //List<int> numbers = new ArrayList<>(); //Type argument cannot be of primitive type
        List<Integer> integers = new ArrayList<>();
    }
}
