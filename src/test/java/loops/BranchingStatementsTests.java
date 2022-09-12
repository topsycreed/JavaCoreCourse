package loops;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class BranchingStatementsTests {

    @Test
    void breakWhileTest() {
        int i = 0;
        while(true) {
            if (i == 10) {
                break;
            }
            i++;
        }
    }

    @Test
    void continueForTest() {
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Нечетное: " + i);
                continue;
            }
            sum += i;
        }
        System.out.println("Сумма четных: " + sum);
    }

    @Test
    void returnTest() {
        int min = 0;
        int max = 9;

        for (int i = 0; i < 10; i++) {
            int number = new Random().nextInt(max - min + 1) + min;
            if (number == 0) {
                System.out.println("Сгенерировано число 0 - игра проиграна");
                return;
            }
            System.out.println("Сгенерировано число: " + number);
        }
    }
}
