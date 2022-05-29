import org.junit.jupiter.api.Test;

public class SimpleClassTests {

    @Test
    void simpleClassWithDefaultConstructorTest() {
        //создание объекта через конструктор по умолчанию: new [Название класса и сигнатура]
        SimpleClass simpleClass = new SimpleClass();
        //если не менять значения полей, то они автоматически инициализируются значениями по умолчанию
        System.out.println(simpleClass.name); //null
        System.out.println(simpleClass.age); //0
        System.out.println(simpleClass.salary); //0.0
        System.out.println(simpleClass.isQA); //false
    }

    @Test
    void simpleClassWithAssigningValuesTest() {
        //создание объекта через конструктор по умолчанию
        SimpleClass simpleClass1 = new SimpleClass();
        SimpleClass simpleClass2 = new SimpleClass();
        //создание объектов и задание значениям их полей
        simpleClass1.name = "Ivan";
        simpleClass1.age = 25;
        simpleClass1.salary = 25000;
        simpleClass1.isQA = false;

        simpleClass2.name = "Elena";
        simpleClass2.age = 20;
        simpleClass2.salary = 75000;
        simpleClass2.isQA = true;

        System.out.println(simpleClass1.name); //Ivan
        System.out.println(simpleClass1.age); //25
        System.out.println(simpleClass1.salary); //25000.0
        System.out.println(simpleClass1.isQA); //false

        System.out.println(simpleClass2.name); //Elena
        System.out.println(simpleClass2.age); //20
        System.out.println(simpleClass2.salary); //75000.0
        System.out.println(simpleClass2.isQA); //true
    }
}
