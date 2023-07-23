package com.codecool.datadrivencalculator.logic;

import com.codecool.datadrivencalculator.data.Calculation;
import com.codecool.datadrivencalculator.logic.operation.Operation;

import java.util.Set;

public class Calculator {
    private final Set<Operation> operations;

    public Calculator(Set<Operation> operations) {
        this.operations = operations;
    }

    public int calculate(Calculation calculation) {
        return operations.stream()
                .filter(operation -> operation.getSymbol().equals(calculation.symbol()))
                .map(operation -> operation.operate(calculation.number1(), calculation.number2()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Operation not supported: " + calculation.symbol()));
    }
}
