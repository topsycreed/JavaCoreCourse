package collections;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTests {

    @Test
    void linkedHashTest() {
        Set<Character> alphabet = new LinkedHashSet<>();

        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        System.out.println(alphabet);//[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]
    }
}
