package org.example.tp1.ConditionCoverageTest;

import org.example.tp1.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {

    @Test
    void testConditionNLessThan1() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0)); // n < 1 → vrai
    }

    @Test
    void testConditionNGreaterThan3999() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000)); // n > 3999 → vrai
    }

    @Test
    void testConditionNBetween1And3999() {
        assertDoesNotThrow(() -> RomanNumeral.toRoman(345)); // n entre 1 et 3999 → faux pour les deux conditions
    }

    @Test
    void testConditionNEqualsBoundary() {
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999)); // limite supérieure
        assertEquals("I", RomanNumeral.toRoman(1)); // limite inférieure
    }
}
