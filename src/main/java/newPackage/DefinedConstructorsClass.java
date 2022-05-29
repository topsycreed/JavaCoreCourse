package newPackage; //именованый пакет, позволяет импортировать класс

public class DefinedConstructorsClass {
    //к полям добавлен модификатор доступа public, иначе их нельзя будет использовать в других пакетах
    public String name;
    public int age;
    public double salary;
    public boolean isQA;

    //Конструктор для всех полей [модификатор доступа] [имя класса](список полей) - нет возвращаемого типа, даже void
    public DefinedConstructorsClass(String name, int age, double salary, boolean isQA) {
        //this - имеет ввиду текущий объект, помогает разграничить поле объекта и переданное в конструктор значение в переменной
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isQA = isQA;
        System.out.println("Constructor for all fields");
    }

//    public DefinedConstructorsClass(String name, int age1, double salary2) {
//        //this - имеет ввиду текущий объект, помогает разграничить поле объекта и переданное в конструктор значение в переменной
//        name = name;
//        //this можно избежать, если иметь разные имена у поля класса и переданных переменных в сигнатуре метода
//        age = age1;
//        salary = salary2;
//    }

    public DefinedConstructorsClass(String name, int age) {
        //внутри конструктора можно вызывать другой конструктор для создания цепочки с помощью this([сигнатура конструктора])
        this(name, age, 0, false); //должен быть первым вызовом!
        System.out.println("Constructor for fields: name, age");
    }

    //Конструктор по умолчанию нужно будет создавать самостоятельно, чтобы была возможность его использовать
    //Обычно в них переопределяют значения по умолчанию для полей
    public DefinedConstructorsClass() {
        this.name = "Tester";
        this.age = 18;
        this.salary = 50000;
        this.isQA = true;
        System.out.println("Constructor without an arguments");
    }
}
