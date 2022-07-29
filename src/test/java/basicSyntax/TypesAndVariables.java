package basicSyntax;

import org.junit.jupiter.api.Test;
import polymorphism.overriding.Cat;

public class TypesAndVariables {

    @Test
    void variables() {
        Cat cat = new Cat();
        //Cat - type
        //cat - name
        // = - assignment operator
        //new Cat() - initialization

        String language = "java";
        int numberOfCats = 5;
    }

    @Test
    void accessingValue() {
        String name = "Gennadiy";

        int a = 1;
        int b = 2;
        System.out.println(a + b);

        b = 3;
        System.out.println(a + b);
    }

    @Test
    void formsOfDeclaration() {
        String language = "java", version = "1.0";
        int year; // declaration
        year = 1996; // initialization

        System.out.println("Syn Microsystems released " + language + " version " + version + " in the " + year);
    }

    @Test
    void typeInference() {
        var variableName = "initialization"; //only since Java 10
        var language = "Java"; // String
        var version = 10; // int
    }
}
