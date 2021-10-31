import abstractClassses.Animal;
import abstractClassses.Cat;
import abstractClassses.Dog;
import org.junit.jupiter.api.Test;

public class AbstractClasssesTests {

    @Test
    void abstractTest() {
//        Animal animal = new Animal(); //'Animal' is abstract; cannot be instantiated
//        Animal animal = new Animal("Animal", 5); //'Animal' is abstract; cannot be instantiated
    }

    @Test
    void abstractDerivedTest() {
        //Обращаться к статическому методу абстрактного класса можно и без создания объекта этого класса, по имени класса
        Animal.getAnimalNumber();//Количество животных: 0
        System.out.println(Animal.CLASS_DESCRIPTION);//This constant field contains the description of the class that can be accesses anywhere
//        System.out.println(Animal.PI);//'PI' has private access in 'abstractClassses.Animal'

        Cat cat = new Cat("Persik", 5);
        System.out.println(cat);//Cat{name='Persik', age=5, bride='Unknown'}
        cat.say();//Meow!
        cat.printName();//Имя животного: Persik

        //Можно переменную объявить как Animal - базового класса, таким образом реализуется полиморфизм в ООП
        Animal animal = new Dog("Charli", 2);
        System.out.println(animal);//Dog{name='Charli', age=2}
        animal.say();//Gav!
        animal.printName();//Имя животного: Charli

        Animal.getAnimalNumber();//Количество животных: 2
    }
}
