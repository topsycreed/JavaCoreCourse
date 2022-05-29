package polymorphism.overloading;

public class Figure {

    //square
    static int area(int a) {
        return a * a;
    }

    //circle
    static double area(double r) {
        return 2 * 3.14 * r;
    }

    //triangle
    static int area(int a, int b, int c) {
        int p = a + b + c;
        return (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    //rectangle
    static int area(int a, int b) {
        return a * b;
    }

    //rectangle
    static double area(double a, int b) {
        return a * b;
    }

    //rectangle
    static double area(int a, double b) {
        return a * b;
    }

}
