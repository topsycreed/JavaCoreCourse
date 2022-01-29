package lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class LombokTests {

    @Test
    void dataTest1() {
//        Computer computer = new Computer("Macbook", 16, false); //not working due RequiredArgsConstructor, you need to add AllArgsConstructor
        Computer computer2 = new Computer();
        Assertions.assertNull(computer2.getTitle());
        Assertions.assertEquals(0, computer2.getRam());
        Assertions.assertNull(computer2.getIsGaming());
    }

    @Test
    void dataTest2() {
        Computer computer2 = new Computer();
        computer2.setTitle("Macbook");
        computer2.setRam(16);
        computer2.setIsGaming(false);
        Assertions.assertEquals("Computer(title=Macbook, ram=16, isGaming=false)", computer2.toString());
    }

    @Test
    void builderTest() {
        Computer2 computer = new Computer2("Macbook", 16, false);
        Computer2 computer2 = Computer2
                .builder()
                .title("Macbook")
                .ram(16)
                .isGaming(false)
                .build();
        Assertions.assertEquals(computer, computer2);
    }

    @Test
    void saveTest() throws IOException {
        Computer2 computer = new Computer2("Macbook", 32, true);
        computer.save();
        Assertions.assertEquals(computer.toString(), computer.read());
    }

    @Test
    void loggerTest() {
        Computer2.print();
    }
}
