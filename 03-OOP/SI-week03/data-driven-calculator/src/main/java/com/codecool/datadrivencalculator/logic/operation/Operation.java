package com.codecool.datadrivencalculator.logic.operation;

public interface Operation {
    String getSymbol();

    int operate(int number1, int number2);
}
