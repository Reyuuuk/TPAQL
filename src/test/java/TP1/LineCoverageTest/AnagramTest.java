package org.example.tp1.LineCoverageTest;

import org.example.tp1.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void testValidAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche")); // chemin normal
    }

    @Test
    void testNotAnagram() {
        assertFalse(Anagram.isAnagram("chat", "chien")); // mêmes longueurs mais lettres différentes
    }

    @Test
    void testDifferentLength() {
        assertFalse(Anagram.isAnagram("ami", "amie")); // s1.length() != s2.length()
    }

    @Test
    void testNullInput() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "test"));
    }
}
