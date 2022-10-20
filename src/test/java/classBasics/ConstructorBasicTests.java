package classBasics;

import org.junit.jupiter.api.Test;

public class ConstructorBasicTests {

    @Test
    void basicTest() {
        NewClassWithConstructor obj1 = new NewClassWithConstructor();
        System.out.println("Name " + obj1.name + ", age " + obj1.age);

        NewClassWithConstructor obj2 = new NewClassWithConstructor("Gena", 32);
        System.out.println("Name " + obj2.name + ", age " + obj2.age);
    }
}
