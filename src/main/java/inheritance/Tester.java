package inheritance;

//класс наследник extends класс родитель
public class Tester extends Employee {
    protected String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //доступ к salary из Employee родительского класса


    public Tester(String name, int yearOfBirth, String address, double salary, String role) {
        //super вызывает конструктор базового класса
        super(name, yearOfBirth, address, salary);
        this.role = role;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", role='" + role + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}
