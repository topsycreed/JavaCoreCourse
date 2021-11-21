package anonymousClass;

public class AnonymousClassExample {

    private static String BYE_STRING = "Auf Wiedersehen!";//it's effective final field constant

    public static String desc = "Test";

    public static void main(String[] args) {
        final String hello = "Guten Tag!";//final local variable

        Speakable germanSpeakingPerson = new Speakable() {
            @Override
            public void sayHello() {
                System.out.println(hello);
            }

            @Override
            public void sayBye() {
                System.out.println(BYE_STRING);
            }
        };

        germanSpeakingPerson.sayHello();
        germanSpeakingPerson.sayBye();
    }

    public void checkAnonymous() {
        AnonymousAbstractClassExample example = new AnonymousAbstractClassExample() {
            @Override
            public void print() {
                System.out.println("This is a print from anonymous class!");
                defaultPrint();
            }

            //could be used inside the body
            public void defaultPrint() {
                super.print();
            }
        };
        example.print();
        //example.defaultPrint();//cannot use a new method oustide the body without adding it to AnonymousAbstractClassExample
    }
}
