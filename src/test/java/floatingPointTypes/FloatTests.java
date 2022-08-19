package floatingPointTypes;

import org.junit.jupiter.api.Test;

public class FloatTests {

    @Test
    void floatTest() {
        float pi = 3.1415f;
        float negative = -0.1f;
        float intValue = 1f;
        float withBigFloatPart = 0.123456789f;
        float withoutFloat = (float) 0.123;

        System.out.println(pi); // 3.1415
        System.out.println(negative); // -0.1
        System.out.println(intValue); // 1.0
        System.out.println(withBigFloatPart); // 0.12345679
        System.out.println(Float.MAX_VALUE); // 3.4028235E38
        System.out.println(Float.MIN_VALUE); // 1.4E-45
    }
}
