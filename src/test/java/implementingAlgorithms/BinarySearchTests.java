package implementingAlgorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BinarySearchTests {

    @Test
    void binarySearchTest() {
        int[] array = { 10, 13, 19, 20, 24, 26, 30, 34, 35 }; //should be sorted!
        int left = 0, right = array.length - 1;
        Assertions.assertEquals(Arrays.binarySearch(array, left, right,10), binarySearch(array,  left, right, 10));
        Assertions.assertEquals(Arrays.binarySearch(array, left, right,24), binarySearch(array,  left, right, 24));
        Assertions.assertEquals(Arrays.binarySearch(array, left, right,34), binarySearch(array,  left, right, 34));
        Assertions.assertEquals(-1, binarySearch(array,  left, right, 14));
    }

    private int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = left + (right - left) / 2; // the index of the middle element
            if (value == array[middle]) {
                return middle; // the element is found, return its index
            } else if (value < array[middle]) {
                right = middle - 1; // go to the left sub array
            } else {
                left = middle + 1;  // go to the right sub array
            }
        }
        return -1; // the element is not found
    }
}
