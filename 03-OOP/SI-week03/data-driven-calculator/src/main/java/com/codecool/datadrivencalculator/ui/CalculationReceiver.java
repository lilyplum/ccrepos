package com.codecool.datadrivencalculator.ui;


import com.codecool.datadrivencalculator.data.Calculation;
import com.codecool.datadrivencalculator.logic.operation.Operation;

import java.util.Scanner;
import java.util.Set;

import static java.util.stream.Collectors.joining;

public class CalculationReceiver {
    private final Scanner scanner;
    private final Set<Operation> operations;

    public CalculationReceiver(Scanner scanner, Set<Operation> operations) {
        this.scanner = scanner;
        this.operations = operations;
    }

    public Calculation receive() {
        System.out.println("Simple calculator");
        System.out.print("Number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Operation " + getOperationSymbols() + ": ");
        String symbol = scanner.next();
        System.out.print("Number 2: ");
        int number2 = scanner.nextInt();
        return new Calculation(symbol, number1, number2);
    }

    private String getOperationSymbols() {
        return operations.stream()
                .map(Operation::getSymbol)
                .collect(joining(", ", "(", ")"));
    }
}
