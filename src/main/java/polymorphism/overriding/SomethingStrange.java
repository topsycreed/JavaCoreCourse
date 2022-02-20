package polymorphism.overriding;

public class SomethingStrange extends Animal {

    @Override //override can use parent class method by using super
    public void say() {
        super.say();
        System.out.println("But also am the strange one");
    }
}
