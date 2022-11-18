package natalieHomework;

public interface Movable {

    void move();

    default void run() {
        System.out.println("Creatures moves faster");
    }
}
