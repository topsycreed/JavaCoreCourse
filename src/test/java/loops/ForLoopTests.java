package loops;

import org.junit.jupiter.api.Test;

public class ForLoopTests {

    @Test
    void forLoopTest() {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("--------------------");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    @Test
    void infiniteForLoopTest() {
        for (; ;) {
            System.out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        }
    }

    @Test
    void nestedForLoopTest() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + j + "\t");
            }
            System.out.println();
        }
    }
}
