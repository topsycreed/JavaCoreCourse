import newPackage.DefinedConstructorsClass;
import org.junit.jupiter.api.Test;

public class DefinedConstructorsClassTests {

    @Test
    void defaultConstructorTest() {
        //Невозможно создать объект конструктора по умолчанию, если мы создали свой конструктор, но явно не создадим свой конструктор без параметоров
        DefinedConstructorsClass definedConstructorsClass = new DefinedConstructorsClass();
        System.out.println(definedConstructorsClass.name); //Tester
        System.out.println(definedConstructorsClass.age); //18
        System.out.println(definedConstructorsClass.salary); //50000.0
        System.out.println(definedConstructorsClass.isQA); //true
    }

    @Test
    void definedConstructorTest() {
        DefinedConstructorsClass definedConstructorsClass1 = new DefinedConstructorsClass("Ivan", 25, 25000, false);
        DefinedConstructorsClass definedConstructorsClass2 = new DefinedConstructorsClass("Elena", 20);

        System.out.println(definedConstructorsClass1.name); //Ivan
        System.out.println(definedConstructorsClass1.age); //25
        System.out.println(definedConstructorsClass1.salary); //25000.0
        System.out.println(definedConstructorsClass1.isQA); //false

        System.out.println(definedConstructorsClass2.name); //Elena
        System.out.println(definedConstructorsClass2.age); //20
        System.out.println(definedConstructorsClass2.salary); //75000.0
        System.out.println(definedConstructorsClass2.isQA); //true
    }
}
