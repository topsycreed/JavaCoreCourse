package inheritance;

//Базовый класс
public class Person {
    //если хотим дать доступ во всех пакетах и наследникам
    public String name;
    //если хотим дать доступ к полям в классах наследниках, но не в других пакетах - используем protected
    protected int yearOfBirth;
    //если хотим ограничить доступ к полю address
    private String address;

    //но через public метод все равно можно получить доступ к полю address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Если мы добавляем конструктор в базовый класс, значит мы лишаемся конструктора по умолчанию без аргументов
    // и наши наследники вернут ошибку: There is no default constructor available in 'inheritance.Person'
    // то там тоже не сделать свой конструктор!
    public Person(String name, int yearOfBirth, String address) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }

    //либо сделать конструктор без аргументов сдесь намерянно
    public Person() {}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address='" + address + '\'' +
                '}';
    }
}
