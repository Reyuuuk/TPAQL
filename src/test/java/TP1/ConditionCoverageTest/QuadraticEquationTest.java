package org.example.tp1.ConditionCoverageTest;

import org.example.tp1.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    void testConditionAEqualsZeroTrue() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 1, 1)); // a == 0
    }

    @Test
    void testConditionAEqualsZeroFalse() {
        assertDoesNotThrow(() -> QuadraticEquation.solve(1, 1, 1)); // a != 0
    }

    @Test
    void testDeltaConditionNegative() {
        assertNull(QuadraticEquation.solve(1, 1, 1)); // delta < 0
    }

    @Test
    void testDeltaConditionZero() {
        double[] result = QuadraticEquation.solve(1, 2, 1); // delta == 0
        assertArrayEquals(new double[]{-1.0}, result);
    }

    @Test
    void testDeltaConditionPositive() {
        double[] result = QuadraticEquation.solve(1, -3, 2); // delta > 0
        assertArrayEquals(new double[]{2.0, 1.0}, result);
    }
}
