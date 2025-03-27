package fibonacci;

import org.example.Fibonacci;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    @DisplayName("Test de Fibonacci pour n = 0")
    void testFibonacciZero() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    @DisplayName("Test de Fibonacci pour n = 1")
    void testFibonacciOne() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    @DisplayName("Test de Fibonacci pour n = 5")
    void testFibonacciFive() {
        assertEquals(5, Fibonacci.fibonacci(5));
    }

    @Test
    @DisplayName("Test de Fibonacci pour n = 10")
    void testFibonacciTen() {
        assertEquals(55, Fibonacci.fibonacci(10));
    }

    @Test
    @DisplayName("Test de Fibonacci avec un nombre négatif")
    void testFibonacciNegative() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }
}
