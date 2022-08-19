package booleanType;

import org.junit.jupiter.api.Test;

public class BooleanTests {

    @Test
    void booleanTest() {
        boolean f = false; // f is false
        boolean t = !f;    // t is true

        //AND
        boolean b1 = false && false; // false
        boolean b2 = false && true;  // false
        boolean b3 = true && false;  // false
        boolean b4 = true && true;   // true

        //OR
        boolean b11 = false || false; // false
        boolean b12 = false || true;  // true
        boolean b13 = true || false;  // true
        boolean b14 = true || true;   // true

        //XOR
        boolean b21 = false ^ false; // false
        boolean b22 = false ^ true;  // true
        boolean b23 = true ^ false;  // true
        boolean b24 = true ^ true;   // false
    }
}
