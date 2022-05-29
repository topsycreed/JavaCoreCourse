import abstractClassses.Animal;
import abstractClassses.Cat;
import abstractClassses.Dog;
import innerClass.Superhero;
import org.junit.jupiter.api.Test;

public class InnerClassTests {

    @Test
    void innerClassTest() {
        Superhero spiderMan = new Superhero("Piter Parker", "Spider-Man");
        Superhero.Mjolnir mjolnir = spiderMan.new Mjolnir(false);
        mjolnir.printDecision();//Superhero Spider-Man cannot use Mjolnir :(
        Superhero thor = new Superhero("Thor Odinson", "Thor");
        Superhero.Mjolnir mjolnir2 = thor.new Mjolnir(true);
        mjolnir2.printDecision();//Superhero Thor is able to use Mjolnir!
    }

    @Test
    void innerClassTestPrivateMethod() {
        Superhero spiderMan = new Superhero("Piter Parker", "Spider-Man");
        Superhero.Mjolnir mjolnir = spiderMan.new Mjolnir(false);
//        mjolnir.tryToGet();//cannot be invoke outside of outer class!
        spiderMan.say(false);//can be used from outer class!
//        My real name is Piter Parker
//        Superhero Spider-Man cannot use Mjolnir :(
    }

    @Test
    void innerClassTestPrivateClass() {
        Superhero ironMan = new Superhero("Tony Stark", "Iron Man");
//        ManSuperhero.IronManArmor = ironMan.new IronManArmor("Mark 3");//cannot be invoke outside of outer class!
        ironMan.wearArmor("Mark 3");//can be used from outer class
//        My real name is Tony Stark
//        Superhero Iron Man worn an armor called Mark 3!
//        This is an armor for superhero internal use only! Be careful!
    }
}
