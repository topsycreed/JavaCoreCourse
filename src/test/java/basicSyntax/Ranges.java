package basicSyntax;

import org.junit.jupiter.api.Test;

public class Ranges {

    @Test
    void numbers() {
        byte a1 = -128, a2 = 127; // size 8 bits (1 byte)
        short b1 = -32768, b2 = 32767; // size 16 bits (2 bytes)
        int c1 = -2_147_483_648, c2 = 2_147_483_647; // size 32 bits (4 bytes)
        long d1 = -9_223_372_036_854_775_808L, d2 = 9_223_372_036_854_775_807L; // size 64 bits (8 bytes)

        double f1 = 4.9E-324, f2 = 1.7976931348623157E308; // (64 bits)
        float g1 = 1.4E-45f, g2 = 3.4028235E38f; // (32 bits)
    }

    @Test
    void chars() {
        char a = 'a'; // (2 bytes = 16bits)
    }

    @Test
    void bool() {
        boolean a = true; // bit
    }
}
