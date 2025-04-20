package org.example.tp1.BranchCoverageTest;

import org.example.tp1.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testThrowsWhenZero() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0));
    }

    @Test
    void testFizzBuzzCase() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }

    @Test
    void testFizzCase() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    @Test
    void testBuzzCase() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    void testElseCase() {
        assertEquals("8", FizzBuzz.fizzBuzz(8));
    }
}
