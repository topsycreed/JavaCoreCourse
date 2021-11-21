package staticAndInstanceBlocks;

import java.util.Date;

public class StaticInitBlockExample {

    private static String stringField;
    private static Date dateField;

    private static final String A_STRING_CONSTANT;

    private static int count = 0;// the first assignment

    static {
        stringField = getEmptyString();
        dateField = new Date();
        A_STRING_CONSTANT = "unknown";
        count += 1;// the second assignment
    }

    private static String getEmptyString() {
        return"empty";
    }

    public void print() {
        System.out.println(stringField);
        System.out.println(dateField);
        System.out.println(A_STRING_CONSTANT);
        System.out.println(count);
    }
}
