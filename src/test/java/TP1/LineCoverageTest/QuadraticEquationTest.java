package org.example.tp1.LineCoverageTest;

import org.example.tp1.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    void testTwoRealSolutions() {
        double[] result = QuadraticEquation.solve(1, -3, 2); // delta = 1
        assertArrayEquals(new double[]{2.0, 1.0}, result);
    }

    @Test
    void testOneRealSolution() {
        double[] result = QuadraticEquation.solve(1, 2, 1); // delta = 0
        assertArrayEquals(new double[]{-1.0}, result);
    }

    @Test
    void testNoRealSolution() {
        assertNull(QuadraticEquation.solve(1, 1, 1)); // delta < 0
    }

    @Test
    void testInvalidA() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 2, 1));
    }
}
