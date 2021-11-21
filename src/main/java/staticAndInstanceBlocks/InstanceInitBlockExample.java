package staticAndInstanceBlocks;

public class InstanceInitBlockExample {
    private int field;
    private int[] array;

    public InstanceInitBlockExample() {
        System.out.println("Constructor called");
    }

    {
        field = 100;//the same as private int field = 40;
    }

    {
        System.out.println("Before the constructor");
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }
    }

    public void print() {
        for (int num : array) {
            System.out.printf("%d ", num);
        }
    }
}
