package org.example.tp1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorConditionTest {
    @Test
    public void testMax123() {
        CalculatorCondition calc = new CalculatorCondition();
        assertEquals(3, calc.max(1, 2, 3));
    }

    @Test
    public void testMax321() {
        CalculatorCondition calc = new CalculatorCondition();
        assertEquals(3, calc.max(3, 2, 1));
    }

    @Test
    public void testMax231() {
        CalculatorCondition calc = new CalculatorCondition();
        assertEquals(3, calc.max(2, 3, 1));
    }

    @Test
    public void testMaxEqual() {
        CalculatorCondition calc = new CalculatorCondition();
        assertEquals(1, calc.max(1, 1, 1));
    }
  
}