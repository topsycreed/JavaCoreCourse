package natalieHomework;

public final class Cow extends GrassEater implements Movable{
    private  final String sayWord = "Muuuu";

    @Override
    public void say() {
        System.out.println(sayWord);
    }

    @Override
    public void say(String word) {
        System.out.println("Muuuu " + word);
    }

    public Cow(String name, int age, String nickname, Boolean pairHoof) {
        super(name, age, nickname, pairHoof);
        ++count;
    }

    public Cow() {
        ++count;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "sayWord='" + sayWord + '\'' +
                ", nickname='" + nickname + '\'' +
                ", pairHoof=" + pairHoof +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cow cow = (Cow) o;

        if (sayWord.equals(cow.sayWord) && nickname.equals(cow.nickname) && pairHoof.equals(cow.pairHoof) && name.equals(cow.name) && age == cow.age) {
            return true;
        } else return false;
    }

    @Override
    public int hashCode() {
        return sayWord != null ? sayWord.hashCode() : 0;
    }

    @Override
    public void move() {
        System.out.println("Cow moved a little bit");
    }

    public static class Сalf {
        private double weight;

        public Сalf(double weight) {
            this.weight = weight;
        }

        public void born() {
            System.out.println("New calf was born with weight " + weight);
        }
    }
}
