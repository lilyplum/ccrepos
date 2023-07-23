package com.codecool.fizzbuzzcooperation.logic.check;

public class DivisibleBy3 implements Check{
    @Override
    public boolean validates(int number) {
        if (number % 3 == 0) {
            return true;
        }
        return false;
    }
    @Override
    public String getKeyword() {
        return "Fizz";
    }
}
