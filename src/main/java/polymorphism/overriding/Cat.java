package polymorphism.overriding;

public class Cat extends Animal {

    @Override
    public void say() {
        System.out.println("Meow");
    }

    public void say(String ownerName) {
        System.out.println("Meow " + ownerName);
    }

//    say2() has a private access
//    @Override
//    public void say2() {
//        System.out.println("Meow...");
//    }

//    Instance method cannot override static method
//    void getDescription() {
//
//    }

    static void getDescription() {
        System.out.println("Meow???");
    }
}
