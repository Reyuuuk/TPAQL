package org.example.tp1.BranchCoverageTest;

import org.example.tp1.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void testNullString1() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "test")); // s1 == null
    }

    @Test
    void testNullString2() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("test", null)); // s2 == null
    }

    @Test
    void testNotSameLength() {
        assertFalse(Anagram.isAnagram("abc", "abcd")); // s1.length != s2.length
    }

    @Test
    void testMismatchCharacters() {
        assertFalse(Anagram.isAnagram("abc", "def")); // tableaux count différents
    }

    @Test
    void testValidAnagram() {
        assertTrue(Anagram.isAnagram("listen", "silent")); // tous les if passent
    }
}
