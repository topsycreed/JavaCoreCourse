package sortingAlgorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTests {

    private final int[] numbers1 = new int[] {1, 2, 3, 4, 5};
    private final int[] numbers2 = new int[] {5, 3, 1, 2, 4};
    private final int[] numbers3 = new int[] {5, 4, 3, 2, 1};

    @Test
    void bubbleSortTest() {
        Assertions.assertArrayEquals(numbers1, bubbleSort(numbers1));
        Assertions.assertArrayEquals(numbers1, bubbleSort(numbers2));
        Assertions.assertArrayEquals(numbers1, bubbleSort(numbers3));
    }

    private static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
