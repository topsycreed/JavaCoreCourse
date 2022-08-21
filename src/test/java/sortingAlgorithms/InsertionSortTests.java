package sortingAlgorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertionSortTests {

    private final int[] numbers1 = new int[] {1, 2, 3, 4, 5};
    private final int[] numbers2 = new int[] {5, 3, 1, 2, 4};
    private final int[] numbers3 = new int[] {5, 4, 3, 2, 1};

    @Test
    void insertionSortTest() {
        Assertions.assertArrayEquals(numbers1, insertionSort(numbers1));
        Assertions.assertArrayEquals(numbers1, insertionSort(numbers2));
        Assertions.assertArrayEquals(numbers1, insertionSort(numbers3));
    }

    private static int[] insertionSort(int[] array) {
        /* iterating over elements in the unsorted part */
        for (int i = 1; i < array.length; i++) {
            int elem = array[i];
            int j = i - 1;
            /* find a suitable position to insert and shift elements to the right */
            while (j >= 0 && array[j] > elem) {
                array[j + 1] = array[j]; // shifting
                j--;
            }
            array[j + 1] = elem; // insert the element in the found position in the sorted part
        }
        return array;
    }
}
