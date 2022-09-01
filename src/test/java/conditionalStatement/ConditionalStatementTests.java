package conditionalStatement;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ConditionalStatementTests {

    @Test
    void singleIfCaseTest() {
        String text = "123";
        String text2 = "abc";
        String text3 = "12c";

        System.out.println(isStringNumber(text));
        System.out.println(isStringNumber(text2));
        System.out.println(isStringNumber(text3));
    }

    private boolean isStringNumber(String text) {
        boolean isNumber = true;
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isDigit(chars[i])) {
                isNumber = false;
            }
        }
        return isNumber;
    }

    @Test
    void ifElseCaseTest() {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        date = date.plusDays(1L);
        System.out.println(date);
        DayOfWeek day = date.getDayOfWeek();
        System.out.println(day);
        if (("FRIDAY").equals(day.toString())) {
            System.out.println("It's mentoring day!");
        } else {
            System.out.println("Relax, it's just regular day!");
        }
    }

    @Test
    void ifElseIfCases() {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        if (date.toString().contains("09-07")) {
            System.out.println("It's my birthday!");
        } else {
            if ("2022-12-31".equals(date.toString())) {
                System.out.println("Happy New Year! 2023!");
            } else {
                System.out.println("Nothing to celebrate today :(");
            }
        }
    }

}
