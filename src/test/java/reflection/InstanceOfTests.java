package reflection;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class InstanceOfTests {

    @Test
    void instanceOfTest() {
        Shape circle = new Circle();  // the reference is Shape, the object is Circle
        Shape rect = new Rectangle(); // the reference is Shape, the object is Rectangle

        boolean circleIsCircle = circle instanceof Circle; // true
        boolean circleIsRectangle = circle instanceof Rectangle; // false
        boolean circleIsShape = circle instanceof Shape; // true

        boolean rectIsRectangle = rect instanceof Rectangle; // true
        boolean rectIsCircle = rect instanceof Circle; // false
        boolean rectIsShape = rect instanceof Shape; // true

        Assertions.assertTrue(circleIsCircle);
        Assertions.assertFalse(circleIsRectangle);
        Assertions.assertTrue(circleIsShape);

        Assertions.assertTrue(rectIsRectangle);
        Assertions.assertFalse(rectIsCircle);
        Assertions.assertTrue(rectIsShape);
    }

    @Test
    void inconvertibleTypesTest() {
        Circle c = new Circle();
//        boolean circleIsRect = c instanceof Rectangle; // Inconvertible types
    }

    @Test
    void reflectionTest() {
        Shape circle = new Circle();

        boolean equalsCircle = circle.getClass() == Circle.class; // true
        boolean equalsShape = circle.getClass() == Shape.class;   // false
        boolean rectangle = circle.getClass() == Rectangle.class; // false

        Assertions.assertTrue(equalsCircle);
        Assertions.assertFalse(equalsShape);
        Assertions.assertFalse(rectangle);
    }

    @Test
    void isInstanceTest() {
        Shape circle = new Circle();

        boolean isInstanceOfCircle = Circle.class.isInstance(circle); // true
        boolean isInstanceOfShape = Shape.class.isInstance(circle); // true
        boolean isInstanceOfRectangle = Rectangle.class.isInstance(circle); // false

        Assertions.assertTrue(isInstanceOfCircle);
        Assertions.assertTrue(isInstanceOfShape);
        Assertions.assertFalse(isInstanceOfRectangle);
    }

    @Test
    void inconvertibleTypesWithReflectionTest() {
        Circle c = new Circle();
        boolean circleIsRect = Rectangle.class.isInstance(c); // working and returns false

        Assertions.assertFalse(circleIsRect);
    }

    @Test
    void exampleTest() {
        Employee employee1 = new Employee("Piter", "Parker", 18, "+1919321515", "123123", "DailyPlanet");
        Employee employee2 = new Employee("Piter", "Parker", 25, "+1919321515", "123123", null);
        boolean compareTheSameObjects = compareObjects(employee1, employee2);
        Assertions.assertFalse(compareTheSameObjects);

        Superhero superhero1 = new Superhero("Spider-man", "Piter", "Parker", 25, "Spider strength and sense");
        Superhero superhero2 = new Superhero("Venom", "Eddi", "Broke", 32, "Alien superpowers");
        boolean compareDifferentObjects1 = compareObjects(employee2, superhero1);
        Assertions.assertTrue(compareDifferentObjects1);

        boolean compareDifferentObjects2 = compareObjects(employee2, superhero2);
        Assertions.assertFalse(compareDifferentObjects2);
    }

    private boolean compareObjects(Object obj1, Object obj2) {
        if (obj1.getClass() == obj2.getClass()) {
            return obj1.equals(obj2);
        } else {
            return compareObjectsByCommonFields(obj1, obj2);
        }
    }

    @SneakyThrows
    private boolean compareObjectsByCommonFields(Object obj1, Object obj2) {
        boolean result = true;
        Field[] fields1 = obj1.getClass().getDeclaredFields();
        Field[] fields2 = obj2.getClass().getDeclaredFields();
        for (Field field1 : fields1) {
            for (Field field2 : fields2) {
                if (field1.getName().equals(field2.getName())) {
                    field1.setAccessible(true);
                    field2.setAccessible(true);
                    String value1 = field1.get(obj1).toString();
                    String value2 = field2.get(obj2).toString();
                    if (!value1.equals(value2)) {
                        System.out.println(String.format("Two objects has difference in field '%s': first value is '%s', second value is '%s'", field1.getName(), value1, value2));
                        result = false;
                    }
                }
            }
        }
        return result;
    }
}
