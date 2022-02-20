package polymorphism.overriding;

public class Dog extends Animal {

    @Override
    public void say() {
        System.out.println("Bark");
    }

//    attempting to assign weaker access privileges ('package-private'); was 'public'
//    @Override
//    void say() {
//        System.out.println("Bark");
//    }

//    overridden method is final
//    @Override
//    public void say3() {
//
//    }

    //this is not overriding
    void getDescription(String name) {
        System.out.println("Bark, my name is " + name);
    }
}
