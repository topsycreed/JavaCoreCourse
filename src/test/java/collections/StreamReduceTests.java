package collections;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceTests {

    @Test
    void sum() {
        List<Integer> transactions = List.of(20, 40, -60, 5);

        Optional<Integer> total = transactions.stream().reduce((sum, transaction) -> sum + transaction);
        /*
        Where sum, first argument - partial result of the reduction;
        transaction, second argument - next element of a stream
        At the first iteration of the reduction, the sum argument equals to the first element of the stream whose value is 20.
        The transaction argument represents the next element of the stream whose value is 40.
         */
//        Optional<Integer> total = Optional.ofNullable(transactions.stream().reduce(0, (sum, transaction) -> sum + transaction));
        /*
        Where 0 - identity value or seed - initial value for the reduction operation
        sum, first argument - partial result of the reduction;
        transaction, second argument - next element of a stream
        Now, the initial value of the partial result sum is 0 and the initial value of the transaction element is 20.
         */
//        Optional<Integer> total = transactions.stream().reduce(Integer::sum);//with method reference
        System.out.println(total.get());
    }

    @Test
    void maxAge() {
        List<Person> persons = Arrays.asList(
                new Person("Mary", 18),
                new Person("John", 21),
                new Person("Andrew", 31),
                new Person("Julia", 19)
        );

        Person person = persons.stream()
                .reduce(new Person("DEFAULT", 0), (p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2);
        System.out.println(person);
    }

    private class Person {
        String name;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
