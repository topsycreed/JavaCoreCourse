package sortingAlgorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortTests {

    private final int[] sorted = new int[] {1, 2, 3, 4, 5};
    private final int[] numbers1 = new int[] {3, 2, 1, 4, 5};
    private final int[] numbers2 = new int[] {5, 3, 1, 2, 4};
    private final int[] numbers3 = new int[] {5, 4, 3, 2, 1};

    @Test
    void mergeSortTest() {
        mergeSort(numbers1, 0, numbers1.length);
        Assertions.assertArrayEquals(sorted, numbers1);

        mergeSort(numbers2, 0, numbers2.length);
        Assertions.assertArrayEquals(sorted, numbers2);
//
        mergeSort(numbers3, 0, numbers3.length);
        Assertions.assertArrayEquals(sorted, numbers3);
    }

    /**
     * Method will sort passed array
     * @param array - array needs to be sort
     * @param left - inclusive left boundary, like first element with index 0
     * @param right - exclusive right boundary, like last element with index array.length
     */
    private static void mergeSort(int[] array, int left, int right) {
        //if subarray <= 1 element - it's already sorted
        if (right <= left + 1) {
            return;
        }
        //divide array by half
        int middle = left + (right - left) / 2;
        //divide and conquer left and right subarrays
        mergeSort(array, left, middle);
        mergeSort(array, middle, right);
        //merge sorted subarrays into sorted one
        merge(array, left, middle, right);
    }

    private static void merge(int[] array, int left, int middle, int right) {
        System.out.println("left: " + left);
        System.out.println("middle: " + middle);
        System.out.println("right: " + right);
        int i = left;   // index for the left subarray
        int j = middle; // index for the right subarray
        int k = 0;      // index for the temp subarray

        int[] temp = new int[right - left]; // temporary array for merging

        //get next lesser element and insert into temp array until one of subarray is empty
        while (i < middle && j < right) {
            if (array[i] <= array[j]) {
                temp[k] = array[i]; //inserted from left subarray
                i++;
            } else {
                temp[k] = array[j]; //inserted from right subarray
                j++;
            }
            k++;
        }

        //insert all remaining elements from left subarray to the temp
        for (; i < middle; i++, k++) {
            temp[k] = array[i];
        }
        //insert all remaining elements from right subarray to the temp
        for (; j < right; j++, k++) {
            temp[k] = array[j];
        }
        System.out.println("Temp array: " + Arrays.toString(temp));
        //copy sorted part into original array
        System.arraycopy(temp, 0, array, left, temp.length);
        System.out.println("Array: " + Arrays.toString(array));
    }
}
