package abstractClassses;

public abstract class Animal {

    protected String name;
    protected int age;
    //статическое поле
    private static int quantity = 0;
    //константы
    public static final String CLASS_DESCRIPTION = "This constant field contains the description of the class that can be accesses anywhere";
    private static final double PI = 3.14159265358979323846;

    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
        //используем статическое поле
        quantity++;
    }

    //абстрактный метод без реализации
    public abstract void say();
    //не абстрактный метод с реализацией
    public void printName() {
        System.out.println("Имя животного: " + name);
    }
    //статический метод
    public static void getAnimalNumber() {
        System.out.println("Количество животных: " + quantity);
    }
}
