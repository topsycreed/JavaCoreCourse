import natalieHomework.Animal;
import natalieHomework.Cow;
import natalieHomework.Horse;

import java.util.Scanner;

public class Main {

    // keywords public, static, class, void
    //main - mame or identifier
    //all inside // - comment
    /*
    multiline comments
     */
    public static void main(String[] args) { //method
        Animal animal1 = new Cow();
        Animal animal2 = new Horse();
        animal1.say();
        animal2.say();
        animal1.say("test");
        animal2.say("test");
        Horse horse = new Horse();
        horse.setSpeed(5.0d);
        horse.printSpeed();
        ((Horse) animal2).setSpeed(4.0d);
        ((Horse) animal2).printSpeed();
        System.out.println("count: " + horse.getCount());
        Cow cow = new Cow("Murka", 2, "Murenocka", true);
        System.out.println("All fields: " + cow);
        System.out.println("All fields: " + horse);
    }
}
