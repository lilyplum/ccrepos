package com.codecool.datadrivencalculator.logic.operation;

public class Subtraction implements Operation {
    @Override
    public String getSymbol() {
        return "-";
    }

    @Override
    public int operate(int number1, int number2) {
        return number1 - number2;
    }
}
