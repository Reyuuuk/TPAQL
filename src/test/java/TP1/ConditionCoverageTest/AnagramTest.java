package org.example.tp1.ConditionCoverageTest;

import org.example.tp1.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void testNullFirstArgument() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "abc")); // s1 == null (vrai)
    }

    @Test
    void testNullSecondArgument() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("abc", null)); // s2 == null (vrai)
    }

    @Test
    void testBothNotNull() {
        assertFalse(Anagram.isAnagram("abc", "abcd")); // s1 != null && s2 != null (les deux faux)
    }

    @Test
    void testEqualLengthButNotAnagram() {
        assertFalse(Anagram.isAnagram("abcd", "dcba")); // conditions vérifiées, mais count mauvais
    }

    @Test
    void testPerfectAnagram() {
        assertTrue(Anagram.isAnagram("debit card", "bad credit")); // cas
    }}