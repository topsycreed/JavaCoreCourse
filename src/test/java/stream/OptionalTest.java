package stream;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest {

    @Test
    void optionalTest() {
        Optional<String> absent = Optional.empty();
        Optional<String> present = Optional.of("Hello");

        System.out.println(absent.isPresent()); // false
        System.out.println(present.isPresent()); // true

        System.out.println(absent.isEmpty()); // true
        System.out.println(present.isEmpty()); // false
    }

    @Test
    void optionalNullableTest() {
        String message = getRandomMessage(); // it may be null
        Optional<String> optMessage = Optional.ofNullable(message);

        System.out.println(optMessage.isPresent()); // true or false
    }

    @Test
    void getOptional() {
        Optional<String> optName = Optional.of("John");
        String name = optName.get(); // "John"

        Optional<String> optName2 = Optional.ofNullable(null);
        String name2 = optName2.get(); // throws NoSuchElementException
    }

    @Test
    void orElseOptional() {
        String nullableName = null;
        String name = Optional.ofNullable(nullableName).orElse("unknown");

        System.out.println(name); // unknown

//        String name2 = Optional
//                .ofNullable(nullableName)
//                .orElseGet(SomeClass::getDefaultResult);//supplier функция
    }

    private String getRandomMessage() {
        return null;
    }
}
