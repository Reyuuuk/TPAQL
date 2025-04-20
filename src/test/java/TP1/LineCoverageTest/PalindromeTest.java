package org.example.tp1.LineCoverageTest;

import org.example.tp1.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testSimplePalindrome() {
        assertTrue(Palindrome.isPalindrome("kayak")); // Test classique
    }

    @Test
    void testNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("bonjour")); // Fausse chaîne
    }

    @Test
    void testNullInput() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }
}
