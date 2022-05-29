package inheritance;

//класс наследник extends класс родитель
public class Client extends Person {
    public String contractNumber;

    //Можем использовать protected поле из родительского класса
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Client{" +
                "contractNumber='" + contractNumber + '\'' +
                ", name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address=" + getAddress() +
                '}';
    }
}
