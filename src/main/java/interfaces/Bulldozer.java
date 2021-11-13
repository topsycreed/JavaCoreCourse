package interfaces;

public class Bulldozer extends Machine implements Movable {
    String size;

    public Bulldozer(String name, int yearOfConstruct, double maxSpeed, double position, String size) {
        super(name, yearOfConstruct, maxSpeed, position);
        this.size = size;
    }

    @Override
    public void move(double speed, int seconds) {
        if (speed > getMaxSpeed()) {
            System.out.println("You have a really fast Bulldozer!");
        }
        setPosition(getPosition() + (speed * seconds));
        currentPosition();
    }

    public void currentPosition() {
        System.out.println(String.format("Bulldozer '%s' has a current position: %s", getName(), getPosition()));
    }
}
