package generics;

public class StaticGenericMethodClass {

    public static <T> T doSomething(T t) {
        return t;
    }

    public static <E> int length(E[] array) {
        return array.length;
    }

    public static <E> void print(E[] array) {
        for (E e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static <T, U> void method(T t, U u) {
        if (t.getClass().getName().equals(u.getClass().getName())) {
            System.out.println("The same class instances");
        } else {
            System.out.println("Different class instances");
        }
    }
}
