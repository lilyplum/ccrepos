package com.codecool.datadrivencalculator.logic.operation;

public class Division implements Operation {
    @Override
    public String getSymbol() {
        return "/";
    }

    @Override
    public int operate(int number1, int number2) {
        return number1 / number2;
    }
}
