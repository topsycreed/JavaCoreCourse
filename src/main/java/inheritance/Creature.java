package inheritance;

//final - запрещает наследоваться от данного класса
public final class Creature {
    private String desciption;

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "desciption='" + desciption + '\'' +
                '}';
    }

    //Cannot inherit from final 'inheritance.Creature'
//    class Animal extends Creature {
//        String type;
//    }
}
