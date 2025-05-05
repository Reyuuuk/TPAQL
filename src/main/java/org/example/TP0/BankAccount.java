package org.example.TP0;

public class BankAccount {

    private double balance;
    private double interestRate;

    public BankAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient balance");
        }
        balance -= amount;
    }

    public void transfer(double amount, BankAccount other) throws NullPointerException {
        if (other == null) {
            throw new NullPointerException("Other account must not b null");
        }
        withdraw(amount);
        other.deposit(amount);
    }

    public void addInterest() {
        balance = balance * (1 + interestRate);
    }

    public double getBalance() {
        return balance;
    }

    public static class MathUtils {

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
}