package generics;

import org.junit.jupiter.api.Test;

public class GenericInstanceTests {

    @Test
    void instanceTest() {
        String a = "a";
        InstanceGenericMethodClass instanceGenericMethodClass = new InstanceGenericMethodClass();
        String aa = instanceGenericMethodClass.getParameterizedObject(a);
        System.out.println(aa);
    }

    @Test
    void instanceTest2() {
        String a = "a";
        Integer b = 123;
        InstanceGenericMethodGenericClass<String> integerInstanceGenericMethodGenericClass = new InstanceGenericMethodGenericClass<>();
        String ab = integerInstanceGenericMethodGenericClass.getParameterizedObject(a, b);
        System.out.println(ab);
    }
}
