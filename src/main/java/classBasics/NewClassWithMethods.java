package classBasics;

public class NewClassWithMethods {
    public static int count;

    public static int countTimes(int countValue) {
        count += countValue;
        return count;
    }

    int countTimes() {
        return 1;
    }

    void countTimes2() {
        System.out.println(count);
    }
}
