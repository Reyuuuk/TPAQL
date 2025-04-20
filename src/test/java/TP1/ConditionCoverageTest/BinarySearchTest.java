package org.example.tp1.ConditionCoverageTest;

import org.example.tp1.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void testNullArrayConditionTrue() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 1));
    }

    @Test
    void testNullArrayConditionFalse() {
        int[] array = {};
        assertEquals(-1, BinarySearch.binarySearch(array, 10));
    }

    @Test
    void testLowLessThanHigh() {
        int[] array = {2, 4, 6, 8, 10};
        assertEquals(1, BinarySearch.binarySearch(array, 4));
    }

    @Test
    void testLowEqualsHigh() {
        int[] array = {5};
        assertEquals(0, BinarySearch.binarySearch(array, 5));
    }

    @Test
    void testConditionsAllFalse() {
        int[] array = {1, 3, 5};
        assertEquals(-1, BinarySearch.binarySearch(array, 7));
    }
}
