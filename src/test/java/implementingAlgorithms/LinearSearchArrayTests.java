package implementingAlgorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinearSearchArrayTests {

    private final int[] numbers1 = new int[] {1, 2, 3, 4, 5}; //4
    private final int[] numbers2 = new int[] {-5, 0, -9, 16, 1}; //3
    private final int[] numbers3 = new int[] {13}; //0
    private final int[] numbers4 = new int[] {1, -2, 3, 3}; //2
    private final int[] numbers5 = new int[] {}; //-1

    @Test
    void runFindValues() {
        Assertions.assertEquals(2, findIndexOfValue(numbers1, 3));
        Assertions.assertEquals(4, findIndexOfValue(numbers2, 1));
        Assertions.assertEquals(-1, findIndexOfValue(numbers3, 1));
        Assertions.assertEquals(2, findIndexOfValue(numbers4, 3));
        Assertions.assertEquals(-1, findIndexOfValue(numbers5, 1));
    }

    @Test
    void runFindValuesWithSort() {
        Assertions.assertEquals(2, findIndexOfValueWithSorted(numbers1, 3));
        Assertions.assertEquals(-1, findIndexOfValueWithSorted(numbers1, 0));
        Assertions.assertEquals(-1, findIndexOfValueWithSorted(numbers1, 6));
    }

    private static int findIndexOfValue(int[] numbers, int value) {
        int index = -1;
        if (numbers.length == 0) {
            return index;
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    private static int findIndexOfValueWithSorted(int[] numbers, int value) {
        int index = -1;
        if (numbers.length == 0) {
            return index;
        }

        if ((numbers[0] > value) || (numbers[numbers.length - 1] < value)) {
            return index;
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }
}
