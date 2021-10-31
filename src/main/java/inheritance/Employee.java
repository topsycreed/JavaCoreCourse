package inheritance;

//класс наследник extends класс родитель
public class Employee extends Person {
    protected double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int yearOfBirth, String address, double salary) {
        //super вызывает конструктор базового класса
        super(name, yearOfBirth, address);
        this.salary = salary;
    }
}
