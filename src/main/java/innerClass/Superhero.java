package innerClass;

public class Superhero {
    private final String name; //only other superheroes should know the real name!
    public String nickname;

    public Superhero(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public void say(boolean isWorthy) {
        System.out.printf("My real name is %s%n", name);
        Mjolnir mjolnir = new Mjolnir(isWorthy);
        mjolnir.tryToGet();
    }

    public void wearArmor(String armorName) {
        System.out.printf("My real name is %s%n", name);
        IronManArmor ironManArmor = new IronManArmor(armorName);
        ironManArmor.printName();
        IronManArmor.printWarning();
    }

    public class Mjolnir {
        boolean isWorthy;

        public Mjolnir(boolean isWorthy) {
            this.isWorthy = isWorthy;
        }

        private void tryToGet() {
            printDecision();
        }

        public void printDecision() {
            System.out.printf(isWorthy ? "Superhero %s is able to use Mjolnir!%n" : "Superhero %s cannot use Mjolnir :(%n", nickname);
        }
    }

    private class IronManArmor {
        private final String armorName;
        private static final String description = "This is an armor for superhero internal use only! Be careful!";

        public IronManArmor(String armorName) {
            this.armorName = armorName;
        }

        private void printName() {
            System.out.printf("Superhero %s worn an armor called %s!%n", nickname, armorName);
        }

        private static void printWarning() {
//            System.out.println(description + armorName);//Non-static field 'armorName' cannot be referenced from a static context
            System.out.println(description);
        }
    }
}
