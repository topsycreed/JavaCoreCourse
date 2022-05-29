package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsTests {

    @Test
    void collectionTest() {
        Collection<String> languages = new ArrayList<>();

        languages.add("English");
        languages.add("Deutsch");
        languages.add("Français");

        for (String lang : languages) {
            System.out.println(lang);
        }
        //English
        //Deutsch
        //Français

        //languages.forEach(System.out::println);//the same as for-each
    }

    @Test
    void removeCollectionTest() {
        Collection<String> languages = new ArrayList<>();

        languages.add("English");
        languages.add("Deutsch");
        languages.add("Français");
        languages.add("Russian");

        languages.remove("English");

        for (String lang : languages) {
            System.out.println(lang);
        }
        //Deutsch
        //Français
        //Russian
        System.out.println("-------------------------");
        languages.removeIf(lang -> lang.length() < 8);
        for (String lang : languages) {
            System.out.println(lang);
        }
        //Français
    }
}
