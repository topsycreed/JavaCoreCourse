package basicSyntax;

import org.junit.jupiter.api.Test;

public class PrintingData {

    @Test
    void printing1() {
        System.out.println("I ");
        System.out.println("know ");
        System.out.println("Java ");
        System.out.println("well.");
    }

    @Test
    void printing2() {
        System.out.println("Java is a popular programming language.");
        System.out.println(); // prints empty line
        System.out.println("It is used all over the world!");
    }

    @Test
    void printing3() {
        System.out.print("I ");
        System.out.print("know ");
        System.out.print("Java ");
        System.out.print("well.");
    }

    @Test
    void printNumbers() {
        System.out.println(108);   // printing a number
        System.out.println('c');   // printing a character that represents a letter
        System.out.println("Q");   // printing a string
        System.out.println('3'); // printing a character that represents a digit
    }
}
