package polymorphism.overriding;

public class Animal {

    public void say() {
        System.out.println("Hello, I'm an unknown animal");
    }

    private void say2() {
        System.out.println("See you later");
    }

    final public void say3() {
        System.out.println("Hello, I'm an unknown animal");
    }

    static void getDescription() {
        System.out.println("I can speak, but I don't have a concrete type");
    }
}
