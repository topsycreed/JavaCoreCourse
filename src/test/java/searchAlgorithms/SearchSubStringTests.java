package searchAlgorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchSubStringTests {

    private static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor" +
            " incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco" +
            " laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit" +
            " esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa" +
            " qui officia deserunt mollit anim id est laborum.";

    @Test
    void searchSubStringTest() {
        Assertions.assertFalse(containsSubstring(TEXT, "test"));
        Assertions.assertTrue(containsSubstring(TEXT, "Lorem"));
        Assertions.assertTrue(containsSubstring(TEXT, "Lorem ipsum dolor sit amet"));
        Assertions.assertFalse(containsSubstring(TEXT, "Lorem ipsum dolor sit amet "));
    }

    private static boolean containsSubstring(String text, String substring) {
        if (text.length() < substring.length()) {
            return false;
        }
        for (int i = 0; i < text.length() - substring.length() + 1; i++) {
            boolean substringIsFound = true;
            for (int j = 0; j < substring.length(); j++) {
                if (text.charAt(i + j) != substring.charAt(j)) {
                    substringIsFound = false;
                    break;
                }
            }
            if (substringIsFound) {
                return true;
            }
        }
        return false;
    }
}
