package reflection;

public class Student {
    public String firstName;
    public String lastName;
    public int age;
    protected String phoneNumber;
    private String accountNumber;
    public static final int maxNumberOfStudent = 100;

    Student() {
        System.out.println("This is default Constructor");
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("This is public Constructor");
    }

    private String sanitizeAccountNumber(String accountNumber) {
        System.out.println("This is a private method to sanitize account number");
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        accountNumber = sanitizeAccountNumber(accountNumber);
        this.accountNumber = accountNumber;
    }
}
