package com.codecool.mathformulas;

public class DividerService {

    public int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }

    public boolean isDivisible(int dividend, int divisor) {
        if (dividend % divisor == 0) {
            return true;
        }
        return false;
    }

    public boolean hasTheSameReminder(int dividend1, int dividend2, int divisor) {
        if (dividend1 % divisor == dividend2 % divisor) {
            return true;
        }
        return false;
    }

    public int numberOfMultiples(int n, int limit) {

        return limit / n;
    }

    public boolean areRelativePrimes(int a, int b) {
        if (a <= 1 || b <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int getLCM(int a, int b) {
        int gcd = getGCD(a, b);
        int lcm = (a * b) / gcd;
        return lcm;
    }
}
