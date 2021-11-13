package interfaces;

public class Class implements Interface {

    //You must implement public abstract methods
    @Override
    public void instanceMethod1() {
        System.out.println("This is implemented method1 from the interface!");
    }

    @Override
    public void instanceMethod2() {
        System.out.println("This is implemented method2 from the interface!");
    }

    //You don't need to implement default methods, but you could change the default logic here
    @Override
    public void defaultMethod() {
        //You have access to public interface constant from any place
        System.out.println("This is constant from an interface: " + INT_CONSTANT);
        //You have access to public interface static method from any place by interface name
        Interface.staticMethod();
        System.out.println("This is a overridden default method from an interface!");
    }
}
