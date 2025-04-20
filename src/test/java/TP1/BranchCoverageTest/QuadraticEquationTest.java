package org.example.tp1.BranchCoverageTest;

import org.example.tp1.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    void testNegativeDelta() {
        assertNull(QuadraticEquation.solve(1, 0, 1)); // delta < 0
    }

    @Test
    void testZeroDelta() {
        double[] result = QuadraticEquation.solve(1, 2, 1); // delta == 0
        assertArrayEquals(new double[]{-1.0}, result);
    }

    @Test
    void testPositiveDelta() {
        double[] result = QuadraticEquation.solve(1, -5, 6); // delta > 0
        assertArrayEquals(new double[]{3.0, 2.0}, result);
    }

    @Test
    void testZeroCoefficientA() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 1, 1));
    }
}
