package loops;

import org.junit.jupiter.api.Test;

public class WhileLoopTests {

    @Test
    public void whileLoopTest() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    @Test
    public void doWhileLoopTest() {
        int i = 9;
        do {
            System.out.println(i);
            i--;
        } while (i >= 0);
    }
}
