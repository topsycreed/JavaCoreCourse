package natalieHomework;

public final class Horse extends GrassEater implements Movable{
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

    @Override
    public void move() {
        System.out.println("Horse moved a lot");
    }

    public void putOnSaddle() {
        Saddle saddle = new Saddle("Brown");
        saddle.setOn();
    }

    public class Saddle {
        boolean isOn = false;
        String color;

        public Saddle(String color) {
            this.color = color;
        }

        public void setOn() {
            isOn = true;
            System.out.println("Saddle is " + isOn + " with color " + color);
        }

        public void setOff() {
            isOn = false;
            System.out.println("Saddle is " + isOn);
        }
    }
}
