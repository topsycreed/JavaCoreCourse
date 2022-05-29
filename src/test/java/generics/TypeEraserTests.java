package generics;

import generics.typeErasure.Data;
import generics.generics.NumberData;
import generics.typeErasure.SomeClass;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TypeEraserTests {

    @Test
    void simple() {
        // Generic types
        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        // Raw type
        List objects = new ArrayList();
    }

    @Test
    void casting() {
        Data<Integer> data = new Data(1);
        Integer value = data.getData();

        Data data1 = new Data(1);
        Integer value1 = (Integer) data1.getData();
    }

    @Test
    void reflection() throws NoSuchFieldException {
        System.out.println(SomeClass.class.toGenericString());

        Field mapField = SomeClass.class.getDeclaredField("map");
        System.out.println(mapField.toGenericString());

        System.out.println(SomeClass.class.getDeclaredMethods()[0].toGenericString());
    }

    @Test
    void bridge() {
        for (Method method : NumberData.class.getMethods()) {
            if (method.isBridge()) {
                System.out.println("Bridge method = " + method.getName());
            }
        }
    }
}
