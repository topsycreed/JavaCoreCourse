package natalieHomework;

public abstract class GrassEater extends Animal {
    String nickname;//null
    Boolean pairHoof;//null

    protected GrassEater(String name, int age, String nickname, Boolean pairHoof) {
        super(name, age);
        this.nickname = nickname;
        this.pairHoof = pairHoof;
    }

    protected GrassEater() {
    }
}
