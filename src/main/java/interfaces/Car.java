package interfaces;

public class Car extends Machine implements Movable {
    private String color;

    public Car(String name, int yearOfConstruct, double maxSpeed, double position, String color) {
        super(name, yearOfConstruct, maxSpeed, position);
        this.color = color;
    }

    @Override
    public void move(double speed, int seconds) {
        setPosition(getPosition() + (speed * seconds));
        currentPosition();
    }

    public void currentPosition() {
        System.out.println(String.format("Car '%s' has a current position: %s", getName(), getPosition()));
    }
}
