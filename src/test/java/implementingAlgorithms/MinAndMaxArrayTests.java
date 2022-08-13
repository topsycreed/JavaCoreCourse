package implementingAlgorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinAndMaxArrayTests {

    private final int[] numbers1 = new int[] {1, 2, 3, 4, 5}; //4
    private final int[] numbers2 = new int[] {-5, 0, -9, 16, 1}; //3
    private final int[] numbers3 = new int[] {13}; //0
    private final int[] numbers4 = new int[] {1, -2, 3, 3}; //2
    private final int[] numbers5 = new int[] {}; //-1

    @Test
    void runFindMaxValues() {
        Assertions.assertEquals(4, findIndexOfMaxValue(numbers1));
        Assertions.assertEquals(3, findIndexOfMaxValue(numbers2));
        Assertions.assertEquals(0, findIndexOfMaxValue(numbers3));
        Assertions.assertEquals(2, findIndexOfMaxValue(numbers4));
        Assertions.assertEquals(-1, findIndexOfMaxValue(numbers5));
    }

    @Test
    void runFindMinMaxValuesBySortedArray() {
        Assertions.assertEquals(0, findIndexOfMinValueBySorting(numbers1));
        Assertions.assertEquals(4, findIndexOfMaxValueBySorting(numbers2));
    }

    private static int findIndexOfMaxValue(int[] numbers) {
        int index = 0;
        if (numbers.length == 0) {
            return -1;
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[index]) {
                index = i;
            }
        }
        return index;
    }

    private static int findIndexOfMinValueBySorting(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }
        return 0;
    }

    private static int findIndexOfMaxValueBySorting(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }
        return numbers.length - 1;
    }
}
