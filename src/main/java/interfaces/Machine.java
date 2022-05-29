package interfaces;

public abstract class Machine {
    private String name;
    private int yearOfConstruct;
    private double maxSpeed;
    private double position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfConstruct() {
        return yearOfConstruct;
    }

    public void setYearOfConstruct(int yearOfConstruct) {
        this.yearOfConstruct = yearOfConstruct;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Machine(String name, int yearOfConstruct, double speed, double position) {
        this.name = name;
        this.yearOfConstruct = yearOfConstruct;
        this.maxSpeed = speed;
        this.position = position;
    }
}
