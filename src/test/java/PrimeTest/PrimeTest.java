package PrimeTest;

import org.example.Prime;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {

    @Test
    @DisplayName("Test pour un nombre premier")
    void testPrimeNumber() {
        assertTrue(Prime.isPrime(17));
    }

    @Test
    @DisplayName("Test pour un nombre non premier")
    void testNonPrimeNumber() {
        assertFalse(Prime.isPrime(18));
    }

    @Test
    @DisplayName("Test pour le nombre 2 (premier)")
    void testPrimeTwo() {
        assertTrue(Prime.isPrime(2));
    }

    @Test
    @DisplayName("Test pour un nombre négatif")
    void testNegativeNumber() {
        assertFalse(Prime.isPrime(-5));
    }

    @Test
    @DisplayName("Test pour le nombre 0 et 1 (non premiers)")
    void testZeroAndOne() {
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
    }
}
