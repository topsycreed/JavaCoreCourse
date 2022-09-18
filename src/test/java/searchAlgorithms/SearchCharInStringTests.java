package searchAlgorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchCharInStringTests {

    private static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor" +
            " incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco" +
            " laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit" +
            " esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa" +
            " qui officia deserunt mollit anim id est laborum.";

    @Test
    void searchCharInStringTest() {
        Assertions.assertEquals(29, getCharCountIgnoreCase(TEXT, 'a'));
        Assertions.assertEquals(3, getCharCountIgnoreCase(TEXT, 'b'));
        Assertions.assertEquals(16, getCharCountIgnoreCase(TEXT, 'c'));

        Assertions.assertEquals(19, getCharCountIgnoreCaseUsingStream(TEXT, 'd'));
        Assertions.assertEquals(38, getCharCountIgnoreCaseUsingStream(TEXT, 'e'));
        Assertions.assertEquals(3, getCharCountIgnoreCaseUsingStream(TEXT, 'f'));
    }

    private int getCharCountIgnoreCase(String text, char letter) {
        int count = 0;
        text = text.toLowerCase();
        letter = Character.toLowerCase(letter);
        for (int i = 0; i < text.length(); i++) {
            if (letter == text.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    private int getCharCountIgnoreCaseUsingStream(String text, char letter) {
        text = text.toLowerCase();
        letter = Character.toLowerCase(letter);
        char finalLetter = letter;
        return (int) text.chars().filter(s -> s == finalLetter).count();
    }
}
