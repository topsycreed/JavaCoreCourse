package exceptions;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Examples {

    public static String readLineFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("file.txt"));//mandatory to add exception handling for checked exception
        return scanner.nextLine();
    }

    public static Long convertStringToLong(String str) {
        return Long.parseLong(str); // It may throw NumberFormatException, but you could not handle it. since it's unchecked exception
    }

    public static void exceptionHandling() {
        System.out.println("before the try-catch block"); // it will be printed
        try {
            System.out.println("inside the try block before an exception"); // it will be printed
            System.out.println(2 / 0); // it throws ArithmeticException
            System.out.println("inside the try block after the exception"); // it won't be printed
        } catch (Exception e) {
            System.out.println("Division by zero!"); // it will be printed
        }
        System.out.println("after the try-catch block"); // it will be printed
    }

    @SneakyThrows
    public static String readLineFromFileLombok()  {
        Scanner scanner = new Scanner(new File("file.txt"));//mandatory to add exception handling for checked exception
        return scanner.nextLine();
    }

    public static void multipleExceptionHandling() {
        try {
            // code that throws exceptions
            Scanner scanner = new Scanner(new File("file.txt"));
            throw new SQLException();
        } catch (SQLException | IOException e) {
            // handling SQLException, IOException and their subclasses
            System.out.println("multipleExceptionHandling");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // handling any other exceptions
            System.out.println("Something goes wrong");
        }
    }

    public static void finallyBlock() {
        try {
            System.out.println("inside the try block");
            Integer.parseInt("101abc"); // throws NumberFormatException
        } catch (Exception e) {
            System.out.println("inside the catch block");
        } finally {
            System.out.println("inside the finally block");
        }
        System.out.println("after the try-catch-finally block");
    }

    public static void withThrow(int month) {
        if (month > 12 || month < 1) {
            throw new IllegalArgumentException("Please use values from 1 to 12 inclusive");
        } else {
            System.out.println("It's valid month!");
        }
    }
}
