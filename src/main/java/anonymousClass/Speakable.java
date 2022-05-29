package anonymousClass;

public interface Speakable {

    void sayHello();

    void sayBye();

    default void sayCurrentTime() {
        System.out.println("Sorry, I don't have a watch");
    }

    Speakable englishSpeakingPerson = new Speakable() {
        @Override
        public void sayHello() {
            System.out.println("Hello!");
        }

        @Override
        public void sayBye() {
            System.out.println("Bye!");
        }
        //sayCurrentTime don't need to be overriden since it's default
    };

    Speakable cat = new Speakable() {
        @Override
        public void sayHello() {
            System.out.println("Murr!");
        }

        @Override
        public void sayBye() {
            System.out.println("Meow!");
        }

        @Override
        public void sayCurrentTime() {
            System.out.println("Meow???");
        }
    };
}
