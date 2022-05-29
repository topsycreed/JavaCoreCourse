package polymorphism.overriding;

import org.junit.jupiter.api.Test;

public class OverridingTest {

    Animal cat = new Cat();
    Animal dog = new Dog();
    Animal animal = new Animal();
    Animal strange = new SomethingStrange();

    @Test
    void testAnimals() {
        cat.say();//Meow
        dog.say();//Bark
        animal.say();//Hello, I'm an unknown animal
    }

    @Test
    void testStrange() {
        strange.say();//Hello, I'm an unknown animal
    }

    @Test
    void testStatic() {
        Cat.getDescription();
    }


}
