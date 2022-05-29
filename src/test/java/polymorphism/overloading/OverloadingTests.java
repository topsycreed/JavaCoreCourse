package polymorphism.overloading;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OverloadingTests {

    @Test
    void square() {
        Assertions.assertEquals(25, Figure.area(5));
    }

    @Test
    void triangle() {
        Assertions.assertEquals(18, Figure.area(1, 2, 3));
    }

    @Test
    void rectangle() {
        Assertions.assertEquals(6, Figure.area(2, 3));
    }

    @Test
    void circle() {
        Assertions.assertEquals(19.7192, Figure.area(3.14));
    }
}
