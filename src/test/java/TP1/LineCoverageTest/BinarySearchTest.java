package org.example.tp1.LineCoverageTest;

import org.example.tp1.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void testFoundElement() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.binarySearch(array, 5));
    }

    @Test
    void testNotFoundElement() {
        int[] array = {2, 4, 6, 8};
        assertEquals(-1, BinarySearch.binarySearch(array, 5));
    }

    @Test
    void testNullArray() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 1));
    }
}
