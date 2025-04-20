package org.example.tp1.BranchCoverageTest;

import org.example.tp1.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void testElementFoundAtStart() {
        int[] array = {1, 2, 3};
        assertEquals(0, BinarySearch.binarySearch(array, 1)); // if
    }

    @Test
    void testElementOnRight() {
        int[] array = {1, 2, 3};
        assertEquals(2, BinarySearch.binarySearch(array, 3)); // else if
    }

    @Test
    void testElementOnLeft() {
        int[] array = {1, 2, 3};
        assertEquals(1, BinarySearch.binarySearch(array, 2)); // else
    }

    @Test
    void testNullArrayThrows() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 10));
    }

    @Test
    void testElementNotFound() {
        int[] array = {1, 3, 5, 7};
        assertEquals(-1, BinarySearch.binarySearch(array, 6));
    }
}
