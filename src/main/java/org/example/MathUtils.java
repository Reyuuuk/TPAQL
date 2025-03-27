package org.example;

public class MathUtils {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro !");
        }
        return a / b;
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorielle non définie pour les nombres négatifs !");
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
