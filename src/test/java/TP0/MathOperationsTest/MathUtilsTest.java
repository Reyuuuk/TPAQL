package MathOperationsTest;

import org.example.TP0.BankAccount;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    @DisplayName("Test de l'addition de deux nombres positifs")
    void testAddition() {
        assertEquals(5, BankAccount.MathUtils.add(2, 3));
    }

    @Test
    @DisplayName("Test de l'addition avec zéro")
    void testAdditionWithZero() {
        assertEquals(2, BankAccount.MathUtils.add(2, 0));
    }

    @Test
    @DisplayName("Test de l'addition de nombres négatifs")
    void testAdditionNegativeNumbers() {
        assertEquals(-5, BankAccount.MathUtils.add(-2, -3));
    }

    @Test
    @DisplayName("Test de la division par zéro")
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> BankAccount.MathUtils.divide(10, 0));
    }

    @Test
    @DisplayName("Test de la division normale")
    void testDivision() {
        assertEquals(2, BankAccount.MathUtils.divide(10, 5));
    }

    @Test
    @DisplayName("Test de la factorielle de 5")
    void testFactorial() {
        assertEquals(120, BankAccount.MathUtils.factorial(5));
    }

    @Test
    @DisplayName("Test de la factorielle de 0")
    void testFactorialZero() {
        assertEquals(1, BankAccount.MathUtils.factorial(0));
    }

    @Test
    @DisplayName("Test de la factorielle d'un nombre négatif")
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> BankAccount.MathUtils.factorial(-3));
    }
}
