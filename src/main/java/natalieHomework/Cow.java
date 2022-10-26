package natalieHomework;

public final class Cow extends GrassEater{
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
}
