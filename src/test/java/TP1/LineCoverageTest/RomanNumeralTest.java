package org.example.tp1.LineCoverageTest;

import org.example.tp1.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {

    @Test
    void testSimpleConversion() {
        assertEquals("X", RomanNumeral.toRoman(10));
    }

    @Test
    void testComplexConversion() {
        assertEquals("MCMXCIV", RomanNumeral.toRoman(1994));
    }

    @Test
    void testMinimumValue() {
        assertEquals("I", RomanNumeral.toRoman(1));
    }

    @Test
    void testInvalidValueZero() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
    }

    @Test
    void testInvalidValueTooLarge() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }
}
