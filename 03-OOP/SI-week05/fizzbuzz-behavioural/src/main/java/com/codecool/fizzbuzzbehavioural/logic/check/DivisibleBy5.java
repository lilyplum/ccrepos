package com.codecool.fizzbuzzbehavioural.logic.check;

public class DivisibleBy5 implements Check {
    @Override
    public boolean validates(int number) {
        return isDivisibleBy(number, 5);
    }

    private boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

    @Override
    public String getKeyword() {
        return "Buzz";
    }
}
