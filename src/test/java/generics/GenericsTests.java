package generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericsTests {

    @Test
    void create() {
        GenericType<Integer> obj1 = new GenericType<Integer>(10);
        GenericType<String> obj2 = new GenericType<String>("abc");

        Assertions.assertEquals(10, (int) obj1.getT());
        Assertions.assertEquals("abc", obj2.getT());
    }

    @Test
    void createTree() {
        Three<String, Integer, Boolean> three = new Three<>("1", 1, true);

        Assertions.assertEquals(three.getT().equals(three.getU().toString()), three.getV());
    }

    @Test
    void middleArrayItem() {
        GenericArray<String> array1 = new GenericArray<>(new String[] {"item1", "item2", "item3"});
        Assertions.assertEquals("item2", array1.getMiddleItem());

        GenericArray<Integer> array2 = new GenericArray<>(new Integer[] {1, 2, 3, 4});
        Assertions.assertEquals(2, array2.getMiddleItem());
    }

    @Test
    void nonGenericTest() {
        NonGeneric instance1 = new NonGeneric("abc");
        String str = (String) instance1.get(); // Requires explicit casting

        NonGeneric instance2 = new NonGeneric(123);
        String str2 = (String) instance2.get(); // java.lang.ClassCastException

        GenericType<String> instance3 = new GenericType<>("abc");
        String str3 = instance3.getT(); // There is no type-casting here
        //Integer num = instance3.getT(); // It does not compile
    }
}
