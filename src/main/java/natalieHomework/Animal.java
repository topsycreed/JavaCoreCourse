package natalieHomework;

public abstract class Animal {
    String name;//null
    public int age;//0
    public static int count;

    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected Animal() {
    }

    public abstract void say();

    public void say(String word) {
        System.out.println(word);
    }

    public final int getCount() {
        return count;
    }
}
