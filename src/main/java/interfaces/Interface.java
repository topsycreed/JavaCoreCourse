package interfaces;

public interface Interface {
    int INT_CONSTANT = 0;//the same as INT_FIELD, you don't need to write public static final - it will apply by default
    public static final int INT_FIELD = 0;

    //private String name;//Modifier 'private' not allowed here
    //protected String name;//Modifier 'protected' not allowed here

    void instanceMethod1();//the same as instanceMethod2, you don't need to write public abstract - it will apply by default
    public abstract void instanceMethod2();

    /*
    public abstract void instanceMethod3() {
        //Interface abstract methods cannot have body
    }*/

    static void staticMethod() {
        //method();//non static method can't be called from static
        //defaultMethod();//non static method can't be called from static
        System.out.println("This is a static method from an interface! It should have a body");
    }

    default void defaultMethod() {
        //you have access to private method only from default method of an interface
        method();
        System.out.println("This is a default method from an interface! It can be overridden in sub-class. It should have a body");
    }

    private void method() {
        System.out.println("This is a private method from an interface! It should have a body");
    }
}
