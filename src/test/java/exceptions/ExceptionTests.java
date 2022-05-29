package exceptions;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static exceptions.Examples.*;

public class ExceptionTests {

    @Test
    void exceptionTest() {
        //before the try-catch block
        //inside the try block before an exception
        //Division by zero!
        //after the try-catch block
        exceptionHandling();
    }

    @Test
    void throwsTest() throws FileNotFoundException {
        //java.io.FileNotFoundException file.txt (Cannot find the file)
        readLineFromFile();
    }

    @Test
    void lombokTest() {
        //java.io.FileNotFoundException file.txt (Cannot find the file)
        readLineFromFileLombok();
    }

    @Test
    void multipleExceptionsTest() {
        multipleExceptionHandling();
    }

    @Test
    void finallyTest() {
        //inside the try block
        //inside the catch block
        //inside the finally block
        //after the try-catch-finally block
        finallyBlock();
    }

    @Test
    void throwTest() {
        withThrow(1);//It's valid month!
        withThrow(13);//java.lang.IllegalArgumentException: Please use values from 1 to 12 inclusive
    }
}
