package collections;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

public class MapImplementationTests {

    @Test
    void immutableMapTest() {
        Map<String, String> emptyMap = Map.of();

        Map<String, String> friendPhones = Map.of(
                "Gena", "+7-917-555-0118",
                "Elena", "+7-918-555-0220",
                "Maxim", "+7-919-555-0175"
        );

        System.out.println(emptyMap.size());     // 0
        System.out.println(friendPhones.size()); // 3

        String bobPhone = friendPhones.get("Gena"); // +7-917-555-0118
        String alicePhone = friendPhones.get("Denis"); // null

        String phone = friendPhones.getOrDefault("Katy", "Unknown phone"); // Unknown phone

        System.out.println(friendPhones.keySet()); // [Elena, Maxim, Gena]
        System.out.println(friendPhones.values()); // [+7-918-555-0220, +7-919-555-0175, +7-917-555-0118]
    }

    @Test
    void hashMapTest() {
        Map<Integer, String> products = new HashMap<>();
        products.put(1000, "Notebook");
        products.put(2000, "Phone");
        products.put(3000, "Keyboard");
        System.out.println(products); // random
        System.out.println(products.get(1000)); // Notebook
        products.remove(1000);
        System.out.println(products.get(1000)); // null
        products.putIfAbsent(3000, "Mouse"); // it does not change the current element
        System.out.println(products.get(3000)); // Keyboard
    }

    @Test
    void linkedHashMapTest() {
        Map<Integer, String> products = new LinkedHashMap<>(); // ordered map of products
        products.put(1000, "Notebook");
        products.put(2000, "Phone");
        products.put(3000, "Keyboard");

        System.out.println(products); // it's always ordered {1000=Notebook, 2000=Phone, 3000=Keyboard}
    }

    @Test
    void treeMapTest() {
        SortedMap<LocalDate, String> events = new TreeMap<>();
        events.put(LocalDate.of(2017, 6, 6), "The Java Conference");
        events.put(LocalDate.of(2017, 6, 7), "Another Java Conference");
        events.put(LocalDate.of(2017, 6, 8), "Selenium or Selenide?");
        events.put(LocalDate.of(2017, 6, 9), "The modern art of testing");
        events.put(LocalDate.of(2017, 6, 10), "Copy-paste from stackoverflow masterclass");
        LocalDate fromInclusive = LocalDate.of(2017, 6, 8);
        LocalDate toExclusive = LocalDate.of(2017, 6, 10);
        System.out.println(events.subMap(fromInclusive, toExclusive));//{2017-06-08=Selenium or Selenide?, 2017-06-09=The modern art of testing}
    }

    @Test
    void iteratingOverMapsTest() {
        Map<Integer, String> products = new LinkedHashMap<>(); // ordered map of products
        products.put(1000, "Notebook");
        products.put(2000, "Phone");
        products.put(3000, "Keyboard");

        // printing product ids
        for (Integer id : products.keySet()) {
            System.out.println(id);
        }

        // printing product names
        for (String product : products.values()) {
            System.out.println(product);
        }

        for (var entry : products.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        //the same using lambda
        products.forEach((id, product) -> System.out.println(id + ": " + product));
    }

    @Test
    void mapByCollections() {
        Map<String, Set<String>> synonyms = new HashMap<>();
        synonyms.put("Do", Set.of("Execute"));
        synonyms.put("Make", Set.of("Set", "Attach", "Assign"));
        synonyms.put("Keep", Set.of("Hold", "Retain"));
        System.out.println(synonyms);//{Keep=[Retain, Hold], Make=[Set, Assign, Attach], Do=[Execute]}

        //key also could be a collection, by only immutable
        Map<Set<String>, Set<String>> synonyms2 = new HashMap<>();
        synonyms2.put(Set.of("Test"), Set.of("Check", "Validate"));
        System.out.println(synonyms2);//{[Test]=[Check, Validate]}
    }

    @Test
    void mapEquality() {
        Map<String, Integer> namesToAges1 = Map.of("John", 30, "Alice", 28);
        Map<String, Integer> namesToAges2 = new HashMap<>();

        namesToAges2.put("Alice", 28);
        System.out.println(Objects.equals(namesToAges1, namesToAges2)); // false

        namesToAges2.put("John", 30);
        System.out.println(Objects.equals(namesToAges1, namesToAges2)); // true
    }
}
