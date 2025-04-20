package org.example.tp1.BranchCoverageTest;

import org.example.tp1.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testEvenPalindrome() {
        assertTrue(Palindrome.isPalindrome("deed")); // Branche (i < j) vraie
    }

    @Test
    void testFailingCondition() {
        assertFalse(Palindrome.isPalindrome("test")); // Branche (charAt(i) != charAt(j))
    }

    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null)); // Branche (s == null)
    }

    @Test
    void testOneChar() {
        assertTrue(Palindrome.isPalindrome("a")); // while jamais exécutée (i >= j dès le début)
    }
}


