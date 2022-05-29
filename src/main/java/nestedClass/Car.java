package nestedClass;

public class Car {
    private String name;
    private int enginePower;

    private static int length;

    public static int getLength() {
        return length;
    }

    public static void setLength(int length) {
        Car.length = length;
    }

    public static class Prototype {
        private int id;
        private int location;

        public Prototype(int id, int location) {
            this.id = id;
            this.location = location;
        }

        public Prototype(int id) {
            this.id = id;
            this.location = 0;
        }

        public void move() {
            this.location += 5;
            System.out.println("New location is " + location);
        }

        public void move(int value) {
            //able to use private static from outer class
            if (Car.length <= value) {
                this.location += value;
                System.out.println("New location is " + location);
            } else {
                System.out.println("Distance is so low to move");
            }
        }
    }
}
