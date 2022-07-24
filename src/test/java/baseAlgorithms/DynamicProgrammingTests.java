package baseAlgorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicProgrammingTests {

    private static int[] MEMORY;

    @Test
    void compareDynamicAndConquareForFibonacciNumbers() {
        Assertions.assertEquals(0, calculateFibonacci(0));
        Assertions.assertEquals(1, calculateFibonacci(1));
        Assertions.assertEquals(1, calculateFibonacci(2));
        Assertions.assertEquals(2, calculateFibonacci(3));
        Assertions.assertEquals(3, calculateFibonacci(4));
        Assertions.assertEquals(5, calculateFibonacci(5));
        Assertions.assertEquals(8, calculateFibonacci(6));

        Assertions.assertEquals(0, calculateFibonacciDynamically(0));
        Assertions.assertEquals(1, calculateFibonacciDynamically(1));
        Assertions.assertEquals(1, calculateFibonacciDynamically(2));
        Assertions.assertEquals(2, calculateFibonacciDynamically(3));
        Assertions.assertEquals(3, calculateFibonacciDynamically(4));
        Assertions.assertEquals(5, calculateFibonacciDynamically(5));
        Assertions.assertEquals(8, calculateFibonacciDynamically(6));
    }

    private int calculateFibonacci(int n) {
        if (n < 2) {
            return n == 0 ? 0 : 1;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    private int calculateFibonacciDynamically(int n) {
        initArray(n);
        return calculateFibonacciUsingMemory(n);
    }

    private int calculateFibonacciUsingMemory(int n) {
        if (MEMORY[n] != -1) {
            return MEMORY[n];
        }
        if (n < 2) {
            if (n == 0) {
                MEMORY[n] = 0;
            } else {
                MEMORY[n] = 1;
            }
        } else {
            MEMORY[n] = calculateFibonacciUsingMemory(n - 1) + calculateFibonacciUsingMemory(n - 2);
        }
        return MEMORY[n];
    }

    /*
    Set all fibonacci numbers as not calculated yet with '-1' value
     */
    private void initArray(int n) {
        MEMORY = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            MEMORY[i] = -1;
        }
    }
}
