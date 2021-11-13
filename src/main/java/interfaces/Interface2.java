package interfaces;

//extends another interface
public interface Interface2 extends BaseInterface {

    default void defaultMethod() {
        System.out.println("This is a default method two!");
    }
}
