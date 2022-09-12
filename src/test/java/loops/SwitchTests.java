package loops;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class SwitchTests {

    @Test
    void simpleSwitchTest() {
        int min = 1;
        int max = 4;
        int number = new Random().nextInt(max - min + 1) + min;
        System.out.println(number);
        switch (number) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
        }
    }

    @Test
    void withoutBreakSwitchTest() {
        int min = 1;
        int max = 12;
        int monthNumber = new Random().nextInt(max - min + 1) + min;
        System.out.println(monthNumber);
        switch (monthNumber) {
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            default:
                System.out.println("Some other months, I'm too tired to cover all");
        }
    }

    @Test
    void switchTest() {
        int min = 1;
        int max = 12;
        int monthNumber = new Random().nextInt(max - min + 1) + min;
        System.out.println(monthNumber);
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            default:
                System.out.println("Some other months, I'm too tired to cover all");
                break;
        }
    }

    @Test
    void groupingCasesSwitchTest() {
        int min = 1;
        int max = 12;
        int monthNumber = new Random().nextInt(max - min + 1) + min;
        System.out.println(monthNumber);
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Unknown month");
                break;
        }
    }

    @Test
    void enhancedSwitchTest() {
        int min = 1;
        int max = 12;
        int monthNumber = new Random().nextInt(max - min + 1) + min;
        System.out.println(monthNumber);
        switch (monthNumber) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            default -> System.out.println("Some other months, I'm too tired to cover all");
        }
    }
}
