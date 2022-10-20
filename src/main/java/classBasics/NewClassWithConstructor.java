package classBasics;

public class NewClassWithConstructor{
    String name;
    int age;

    public NewClassWithConstructor() {
        this.name = "test";
        this.age = 18;
    }

    public NewClassWithConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public NewClassWithConstructor(int age) {
        this.name = "test";
        this.age = age;
    }

    public NewClassWithConstructor(String name) {
        this.name = name;
        this.age = 18;
    }

    public NewClassWithConstructor(int age, String name) {
        this.name = name;
        this.age = age;
    }
}
