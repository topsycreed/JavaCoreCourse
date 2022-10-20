package classBasics;

import org.junit.jupiter.api.Test;

public class MethodBasicsTests {

    @Test
    void basicStaticMethodTest() {
        System.out.println(NewClassWithMethods.countTimes(1));//1
        System.out.println(NewClassWithMethods.countTimes(1));//2
        System.out.println(NewClassWithMethods.countTimes(1));//3
        System.out.println(NewClassWithMethods.countTimes(2));//5
    }

    @Test
    void basicInstanceMethodTest() {
        NewClassWithMethods obj1 = new NewClassWithMethods();
        System.out.println(obj1.countTimes());//1
    }

    @Test
    void test3() {
        NewClassWithFields newClassWithFields = new NewClassWithFields();
        newClassWithFields.print();
    }
}
