package com.codecool.fizzbuzzcooperation.logic.check;

public class DivisibleBy5 implements Check{
    @Override
    public boolean validates(int number) {
        if (number % 5 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String getKeyword() {
        return "Buzz";
    }
}
