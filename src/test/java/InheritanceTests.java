import inheritance.Client;
import inheritance.Person;
import inheritance.Tester;
import org.junit.jupiter.api.Test;

public class InheritanceTests {

    @Test
    void baseClassTests() {
        Person person = new Person("Ivan", 1995, "Saratov");
        System.out.println(person);//Person{name='Ivan', yearOfBirth=1995, address='Saratov'}
    }

    @Test
    void derivedClassTests() {
        Client client = new Client();
        client.name = "Client";
        client.setAddress("ClientAddress");
        client.setYearOfBirth(1999);
        client.contractNumber = "+79091234455";
        System.out.println(client);//Client{contractNumber='+79091234455', name='Client', yearOfBirth=1999, address=ClientAddress}
    }

    @Test
    void derivedClassDeepInheritanceTests() {
        Tester tester = new Tester("Tester", 2000, "Moscow", 100000, "AutomationQA");
        System.out.println(tester);//Tester{salary=100000.0, name='Tester', yearOfBirth=2000, role='AutomationQA', address='Moscow'}
    }
}
