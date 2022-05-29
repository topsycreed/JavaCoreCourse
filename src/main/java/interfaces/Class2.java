package interfaces;

public class Class2 extends AbstractClass implements Interface2 {

    //class should implement the interface because extend AbstractClass that implemented the interface (but left methods abstract)
    @Override
    public void instanceMethod1() {
        System.out.println("This is overriden method1 from interface");
    }

    @Override
    public void instanceMethod2() {
        System.out.println("This is overriden method2 from interface");
    }

    //class should implement default method because implemented it twice from 2 interfaces with the same signature
    @Override
    public void defaultMethod() {
        //by default super will related to the firstly implemented interface
        super.defaultMethod();
        //you can set which super you want to use to specify the method
        Interface2.super.defaultMethod();
        System.out.println("This is overriden defaultMethod from interface1 and interface2");
    }
}
