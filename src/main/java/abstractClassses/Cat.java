package abstractClassses;

public class Cat extends Animal {

    private String bride;

    public Cat(String name, int age, String bride) {
        super(name, age);
        this.bride = bride;
    }

    public Cat(String name, int age) {
        super(name, age);
        this.bride = "Unknown";
    }

    //Нужно обязательно реализовать абстрактный метод из родительского класса
    @Override
    public void say() {
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bride='" + bride + '\'' +
                '}';
    }
}
