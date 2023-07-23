package com.codecool.fizzbuzzcooperation.logic.check;

public class DivisibleBy3And5 implements Check{
    @Override
    public boolean validates (int number) {
        if (number % 5 == 0 && number % 3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String getKeyword() {
        return "FizzBuzz";
    }
}
