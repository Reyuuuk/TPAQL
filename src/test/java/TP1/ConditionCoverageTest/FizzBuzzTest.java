package org.example.tp1.ConditionCoverageTest;

import org.example.tp1.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testNLessThanOrEqual1() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(1)); // n <= 1 → vrai
    }

    @Test
    void testNValid() {
        assertDoesNotThrow(() -> FizzBuzz.fizzBuzz(2)); // n > 1 → faux
    }

    @Test
    void testDivisibleBy15() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(45)); // n % 15 == 0 → vrai
    }

    @Test
    void testDivisibleBy3Only() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6)); // n % 3 == 0 → vrai
    }

    @Test
    void testDivisibleBy5Only() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10)); // n % 5 == 0 → vrai
    }

    @Test
    void testNoMatch() {
        assertEquals("11", FizzBuzz.fizzBuzz(11)); // toutes les conditions → fausses
    }
}
