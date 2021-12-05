package collections;

import org.junit.jupiter.api.Test;

import java.util.*;

public class UtilClassCollectionsTests {

    /* Creating immutable collections */
    @Test
    void createImmutableCollection() {
        List<String> emptyList = Collections.emptyList();
        Set<Integer> emptySet = Collections.emptySet();
        Map<Integer, String> emptyMap = Collections.emptyMap();

        List<Integer> singletonList = Collections.singletonList(100);
        Set<String> singletonSet = Collections.singleton("Hello");
        Map<Integer, String> singletonMap = Collections.singletonMap(1, "One");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        List<Integer> immutableList = Collections.unmodifiableList(numbers);
        Set<String> months = new LinkedHashSet<>();
        months.add("Jan");
        months.add("Feb");
        Set<String> immutableSet = Collections.unmodifiableSet(months);
        Map<String, Integer> daysInMonth = new LinkedHashMap<>();
        daysInMonth.put("Jan", 31);
        daysInMonth.put("Feb", 28);
        Map<String, Integer> immutableMap = Collections.unmodifiableMap(daysInMonth);
    }

    @Test
    void createImmutableCollectionJava9() {
        List<String> emptyList = List.of();
        List<Integer> immutableList = List.of(1, 2);
        Set<String> immutableSet = Set.of("Jan", "Feb");
        Map<String, Integer> immutableMap = Map.of("Jan", 31, "Feb", 28);
    }

    @Test
    void processingCollections() {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 2, 3, 4)); // getting a mutable list
        Collections.sort(numbers); // [1, 2, 2, 3, 3, 4]
        System.out.println(numbers);
        Collections.reverse(numbers); // [4, 3, 3, 2, 2, 1]
        System.out.println(numbers);
        Collections.shuffle(numbers); // randomize
        System.out.println(numbers);
        numbers = new ArrayList<>(List.of(1, 2, 3, 2, 3, 4));
        Collections.rotate(numbers, 1);
        System.out.println(numbers); // [4, 1, 2, 3, 2, 3]
        Collections.rotate(numbers, -1);
        System.out.println(numbers); // [1, 2, 3, 2, 3, 4]
        System.out.println(Collections.frequency(numbers, 3)); // 2
        System.out.println(Collections.min(numbers)); // 1
        System.out.println(Collections.max(numbers)); // 4
        System.out.println(Collections.disjoint(numbers, List.of(1, 2))); // false
        System.out.println(Collections.disjoint(numbers, List.of(5, 6))); // true
    }

    @Test
    void processingOtherCollections() {
        Set<Integer> numbers2 = new LinkedHashSet<>(Set.of(1, 3, 2)); // getting a mutable set
        //Collections.sort(numbers2);//we cannot sort set

        Map<String, Integer> map = Map.of("Jan", 31, "Feb", 28);
        //Collections.sort(map);//we cannot sort map
    }
}
