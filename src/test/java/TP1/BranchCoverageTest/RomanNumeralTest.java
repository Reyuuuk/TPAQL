package org.example.tp1.BranchCoverageTest;

import org.example.tp1.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {

    @Test
    void testThrowsForZero() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0)); // if true
    }

    @Test
    void testThrowsForOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(5000)); // if true
    }

    @Test
    void testLoopWithNoSubtraction() {
        assertEquals("III", RomanNumeral.toRoman(3)); // while loop sans soustraction spéciale
    }

    @Test
    void testLoopWithSubtraction() {
        assertEquals("IX", RomanNumeral.toRoman(9)); // while avec soustraction (IX)
    }
}
