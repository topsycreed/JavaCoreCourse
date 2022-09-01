package characters;

import org.junit.jupiter.api.Test;

public class CharTests {

    @Test
    void charTest() {
        char a = 'a'; //one letter
        char b = 98; //int value from 0 to 65535
        char c = '\u0063'; //hexadecimal code from Unicode table
        char d = (char) (c + 1); //could be even with increment c++

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(Character.MAX_VALUE);
    }

    @Test
    void specialCharacters() {
        System.out.print("Hello!");
        System.out.print('\t');
        System.out.print('a');
        System.out.print('\"' + "user" + '\"');
        System.out.print('\n');
        System.out.print("             " + '\r' + "how are you?");
    }

    private int getIntFromChar(char c) {
        return c;
    }

    private String getHexCodeFromChar(char c) {
        return String.format("\\u%04x", (int) c);
    }
}
