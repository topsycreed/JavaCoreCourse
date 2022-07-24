package baseAlgorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivideAndConquerTests {

    @Test
    void calculateSumOfArrayTest() {
        int[] array = { 1, 2, 3, 4, 5 };
        Assertions.assertEquals(1, calculateSum(array, 0, 1));
        Assertions.assertEquals(15, calculateSum(array, 0, 5));
        Assertions.assertEquals(9, calculateSum(array, 1, 4));
        Assertions.assertEquals(0, calculateSum(array, 3, 2));
    }

    private int calculateSum(int[] array, int left, int right) {
        if (left >= right) {
            return 0;
        }
        if (left == right - 1) {
            return array[left];
        }
        int middle = (left + right) / 2;
        int leftSum = calculateSum(array, left, middle);
        int rightSum = calculateSum(array, middle, right);
        return leftSum + rightSum;
    }
}
