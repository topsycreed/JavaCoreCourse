import innerClass.Superhero;
import nestedClass.Car;
import org.junit.jupiter.api.Test;

public class NestedClassTests {

    @Test
    void nestedClassTest() {
        //no need to create a outer object
        Car.Prototype prototype = new Car.Prototype(1);
        prototype.move();//New location is 5
    }

    @Test
    void nestedClassTest2() {
        Car.setLength(3);
        Car.Prototype prototype = new Car.Prototype(1);
        prototype.move(2);//Distance is so low to move
        prototype.move(5);//New location is 5
    }
}
