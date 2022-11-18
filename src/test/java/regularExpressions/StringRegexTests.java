package regularExpressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringRegexTests {

    @Test
    void emailTest() {
        String email = "chursov@mail.ru";
        String invalidEmail1 = "ch@mail.ru";
        String invalidEmail2 = "chursov-mailru";

        String pattern = "[a-zA-Z_0-9]{3,10}@(mail|gmail)\\.(ru|com)";
//        String pattern = "[a-zA-Z_0-9]{3,30}";

        System.out.println(email.matches(pattern));
        System.out.println(invalidEmail1.matches(pattern));
        System.out.println(invalidEmail2.matches(pattern));
    }

    @Test
    void phoneTest() {
        String phone = "+7(967)46-57-57";
//        String invalidEmail1 = "ch@mail.ru";
//        String invalidEmail2 = "chursov-mailru";

        String pattern = "\\+[0-9]{1}\\([0-9]{3}\\)[0-9]{2}-[0-9]{2}-[0-9]{2}";
//        String pattern = "[a-zA-Z_0-9]{3,30}";

        System.out.println(phone.matches(pattern));
//        System.out.println(invalidEmail1.matches(pattern));
//        System.out.println(invalidEmail2.matches(pattern));
    }

    @Test
    void BasicStringTests() {
        String testRegex = "test"; // the "test" regex
        Assertions.assertTrue("test".matches(testRegex));
        Assertions.assertFalse("test2".matches(testRegex));
        Assertions.assertFalse("TEST".matches(testRegex));

        String helloRegex = "Hello, World";
        Assertions.assertTrue("Hello, World".matches(helloRegex));
        Assertions.assertFalse("Hello, world".matches(helloRegex));
        Assertions.assertFalse("Hello,World".matches(helloRegex));
    }

    @Test
    void dotMarkTests() {
        String learnRegex = "Learn.Regex";
        /*
        The dot . matches any single character including letters, digits, spaces, and so on.
        The only character it is unable to match with is the newline character\n.
         */

        Assertions.assertTrue("Learn Regex".matches(learnRegex));
        Assertions.assertTrue("Learn.Regex".matches(learnRegex));
        Assertions.assertTrue("Learn1Regex".matches(learnRegex));
        Assertions.assertTrue("LearnXRegex".matches(learnRegex));

        Assertions.assertFalse("LearnRegex".matches(learnRegex));
        Assertions.assertFalse("Learn, Regex".matches(learnRegex));
        Assertions.assertFalse("Learn\nRegex".matches(learnRegex));
    }

    @Test
    void questionMarkTests() {
        String pattern = "behaviou?r";
        /*
        the preceding character or nothing
         */

        Assertions.assertTrue("behaviour".matches(pattern));
        Assertions.assertTrue("behavior".matches(pattern));
    }

    @Test
    void combineDotAndQuestionTests() {
        String pattern = "..?";

        Assertions.assertTrue("I".matches(pattern));
        Assertions.assertTrue("am".matches(pattern));
        Assertions.assertFalse("ABC".matches(pattern));
        Assertions.assertFalse("".matches(pattern));
    }

    @Test
    void backslashTests() {
        String endRegex = "The End\\.";

        Assertions.assertTrue("The End.".matches(endRegex));
        Assertions.assertFalse("The End?".matches(endRegex));

        String pattern = ".....\\.";

        Assertions.assertTrue("a1b2c.".matches(pattern));
        Assertions.assertTrue("Wrong.".matches(pattern));
        Assertions.assertFalse("Hello!".matches(pattern));
    }

    @Test
    void setOfCharsTests() {
        String pattern = "[bcr]at"; // it matches strings "bat", "cat", "rat", but not "fat"

        Assertions.assertTrue("bat".matches(pattern));
        Assertions.assertTrue("cat".matches(pattern));
        Assertions.assertTrue("rat".matches(pattern));
        Assertions.assertFalse("fat".matches(pattern));

        String pattern2 = "[ab]x[12]"; // can match a or b followed by x followed by either 1 or 2

        Assertions.assertTrue("ax1".matches(pattern2));
        Assertions.assertTrue("ax2".matches(pattern2));
        Assertions.assertTrue("bx1".matches(pattern2));
        Assertions.assertFalse("xa1".matches(pattern2));
    }

    @Test
    void rangeOfCharsTests() {
        String anyDigitPattern = "[0-9]"; // matches any digit from 0 to 9

        Assertions.assertTrue("0".matches(anyDigitPattern));
        Assertions.assertTrue("1".matches(anyDigitPattern));
        Assertions.assertTrue("2".matches(anyDigitPattern));
        Assertions.assertFalse("10".matches(anyDigitPattern));

        String anyLetterPattern = "[a-zA-Z]"; // matches any letter "a", "b", ..., "A", "B", ...

        Assertions.assertTrue("a".matches(anyLetterPattern));
        Assertions.assertTrue("b".matches(anyLetterPattern));
        Assertions.assertTrue("Z".matches(anyLetterPattern));
        Assertions.assertFalse("ZZ".matches(anyLetterPattern));
    }

    @Test
    void excludingCharsTests() {
        String notAbcPattern = "[^abc]"; // matches any chars except a, b, c

        Assertions.assertTrue("d".matches(notAbcPattern));
        Assertions.assertTrue("f".matches(notAbcPattern));
        Assertions.assertTrue("e".matches(notAbcPattern));
        Assertions.assertFalse("c".matches(notAbcPattern));

        String anyLetterPattern = "[^1-9]"; // matches only 0

        Assertions.assertTrue("0".matches(anyLetterPattern));
        Assertions.assertFalse("1".matches(anyLetterPattern));
        Assertions.assertFalse("5".matches(anyLetterPattern));
        Assertions.assertFalse("9".matches(anyLetterPattern));
    }

    @Test
    void alternationsTests() {
        String pattern = "yes|no|maybe"; // matches "yes", "no", or "maybe", but not "y" or "e"

        Assertions.assertTrue("no".matches(pattern));
        Assertions.assertTrue("yes".matches(pattern));
        Assertions.assertTrue("maybe".matches(pattern));
        Assertions.assertFalse("don't know".matches(pattern));

        String pattern2 = "(b|r|go)at"; // matches "bat", "rat" or "goat"
        Assertions.assertTrue("bat".matches(pattern2));
        Assertions.assertTrue("rat".matches(pattern2));
        Assertions.assertTrue("goat".matches(pattern2));
        Assertions.assertFalse("borat".matches(pattern2));
    }

    @Test
    void shorthandsTests() {
        String regex = "\\s\\w\\d\\s";

        Assertions.assertTrue(" A5 ".matches(regex));
        Assertions.assertTrue(" 33 ".matches(regex));
        Assertions.assertTrue("\tA4\t".matches(regex)); // because tabs are whitespace as well
        Assertions.assertFalse("q18q".matches(regex)); //false, 'q' is not a space
        Assertions.assertFalse(" AB ".matches(regex)); //false, 'B' is not a digit
        Assertions.assertFalse(" -1 ".matches(regex)); //false, '-' is not an alphanumeric character, but '1' is OK.
    }

    @Test
    void quantifiersTests() {
        String regex = "ca+b";

        Assertions.assertTrue("cab".matches(regex)); // true
        Assertions.assertTrue("caaaaab".matches(regex)); // true
        Assertions.assertFalse("cb".matches(regex)); // false, because it does not have at least one repetition of'a'

        regex = "A[0-3]*";

        Assertions.assertTrue("A".matches(regex)); // true, because the pattern matches zero or more repetitions
        Assertions.assertTrue("A0".matches(regex)); // true
        Assertions.assertTrue("A000111222333".matches(regex)); // true

        regex = ".*test.*"; // it matches all strings containing the substring "test"

        Assertions.assertTrue("I'm testing programs".matches(regex)); // true
        Assertions.assertTrue("test".matches(regex)); // true
        Assertions.assertFalse("I'm developing programs".matches(regex)); // false

        regex = "[0-9]{4}"; // four digits

        Assertions.assertTrue("6342".matches(regex)); // true
        Assertions.assertTrue("9034".matches(regex)); // true
        Assertions.assertFalse("01234".matches(regex)); // false

        regex = "[1234]{2,3}";

        Assertions.assertFalse("1".matches(regex)); // false
        Assertions.assertTrue("12".matches(regex)); // true
        Assertions.assertTrue("123".matches(regex)); // true
        Assertions.assertFalse("1234".matches(regex)); // false

        regex = "ab{4,}";

        Assertions.assertFalse("abbb".matches(regex)); // false
        Assertions.assertTrue("abbbb".matches(regex)); // true
        Assertions.assertTrue("abbbbbbbbbbbb".matches(regex)); // true

        regex = "Do you have a{0,1}.?cats?\\?";

        Assertions.assertTrue("Do you have cats?".matches(regex)); // true
        Assertions.assertTrue("Do you have a cat?".matches(regex)); // true
    }
}
