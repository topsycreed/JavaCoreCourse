import anonymousClass.AnonymousClassExample;
import anonymousClass.Speakable;
import org.junit.jupiter.api.Test;

public class AnonymousClassesTests {

    @Test
    void anonymousInterfaceTest() {
        Speakable.englishSpeakingPerson.sayHello();//Hello!
        Speakable.englishSpeakingPerson.sayBye();//Bye!

        Speakable.cat.sayHello();//Murr!
        Speakable.cat.sayBye();//Meow!

        Speakable.englishSpeakingPerson.sayCurrentTime();//Sorry, I don't have a watch
        Speakable.cat.sayCurrentTime();//Meow???
    }

    @Test
    void anonymousClassTest() {
        AnonymousClassExample.main(null);
        //Guten Tag!
        //Auf Wiedersehen!

        AnonymousClassExample anonymousClassExample = new AnonymousClassExample();
        anonymousClassExample.checkAnonymous();
        //This is a print from anonymous class!
        //This is a print from abstract class!
    }
}
