import abstractClassses.Animal;
import abstractClassses.Cat;
import abstractClassses.Dog;
import interfaces.*;
import interfaces.Class;
import org.junit.jupiter.api.Test;

public class InterfaceTests {

    @Test
    void interfaceTest() {
        //You can create an object by interface type instead of class type, but class type also ok
        Interface instance = new Class();
        Class instance2 = new Class();

        instance.instanceMethod1();//This is implemented method1 from the interface!
        instance.instanceMethod2();//This is implemented method2 from the interface!
        instance.defaultMethod();
        //This is constant from an interface: 0
        //This is a static method from an interface! It should have a body
        //This is a overridden default method from an interface!

        //public static could be called from everywhere by Interface name as well as constants
        Interface.staticMethod();
        System.out.println(Interface.INT_CONSTANT);
    }

    @Test
    void interfaceTest2() {
        Class2 instance2 = new Class2();
        instance2.instanceMethod1();//This is overriden method1 from interface
        instance2.instanceMethod2();//This is overriden method2 from interface
        instance2.defaultMethod();
        //This is a private method from an interface! It should have a body
        //This is a default method from an interface! It can be overridden in sub-class. It should have a body
        //This is a default method two!
        //This is overriden defaultMethod from interface1 and interface2
    }

    @Test
    void interfaceTest3() {
        Car car = new Car("Mazda RX-5", 2003, 250, 0, "Red");
        Bulldozer bulldozer = new Bulldozer("Bulldozer-1000", 2008, 50, 0, "Green");
        car.move(200, 5);//Car 'Mazda RX-5' has a current position: 1000.0
        bulldozer.move(100, 10);
        //You have a really fast Bulldozer!
        //Bulldozer 'Bulldozer-1000' has a current position: 1000.0
    }

}