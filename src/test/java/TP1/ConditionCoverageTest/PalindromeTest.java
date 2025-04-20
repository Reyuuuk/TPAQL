package org.example.tp1.ConditionCoverageTest;

import org.example.tp1.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testPalindromeWithSpaces() {
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose")); // Tous les tests conditionnels à true
    }

    @Test
    void testNonPalindromeWithSpace() {
        assertFalse(Palindrome.isPalindrome("hello world")); // Une condition fausse
    }

    @Test
    void testNull() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null)); // if (s == null) == true
    }

    @Test
    void testShortPalindrome() {
        assertTrue(Palindrome.isPalindrome("aa")); // (charAt(i) == charAt(j)) vrai, boucle une fois
    }

    @Test
    void testOneLetter() {
        assertTrue(Palindrome.isPalindrome("A")); // Test qui saute la boucle (i >= j)
    }
}
