package natalieHomework;

public final class Horse extends GrassEater{
    private double speed;//0.0d
    private final String sayWord = "Whinny";

    public Horse(String name, int age, String nickname, Boolean pairHoof, double speed) {
        super(name, age, nickname, pairHoof);
        this.speed = speed;
    }

    public Horse() {
        count++;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void say() {
        System.out.println(sayWord);
    }

    public void printSpeed() {
        System.out.println(speed);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "speed=" + speed +
                ", sayWord='" + sayWord + '\'' +
                ", nickname='" + nickname + '\'' +
                ", pairHoof=" + pairHoof +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
