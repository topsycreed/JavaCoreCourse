import org.junit.jupiter.api.Test;
import staticAndInstanceBlocks.InstanceInitBlockExample;
import staticAndInstanceBlocks.StaticInitBlockExample;

public class InitBlocksTests {

    @Test
    void initTest() {
        StaticInitBlockExample staticInitBlockExample = new StaticInitBlockExample();
        staticInitBlockExample.print();
        //empty
        //Sun Nov 21 12:27:46 GMT+04:00 2021
        //unknown
        //1
        InstanceInitBlockExample instanceInitBlockExample = new InstanceInitBlockExample();
        instanceInitBlockExample.print();
        //Before the constructor
        //Constructor called
        //0 1 4 9 16 25 36 49 64 81
    }
}
