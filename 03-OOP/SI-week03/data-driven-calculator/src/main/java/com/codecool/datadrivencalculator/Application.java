package com.codecool.datadrivencalculator;

import com.codecool.datadrivencalculator.data.Calculation;
import com.codecool.datadrivencalculator.logic.Calculator;
import com.codecool.datadrivencalculator.logic.operation.*;
import com.codecool.datadrivencalculator.ui.CalculationReceiver;

import java.util.Scanner;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Operation> operations = Set.of(
                new Addition(),
                new Subtraction(),
                new Multiplication(),
                new Division()
        );
        CalculationReceiver calculationReceiver = new CalculationReceiver(scanner, operations);
        Calculation calculation = calculationReceiver.receive();
        Calculator calculator = new Calculator(operations);
        int result = calculator.calculate(calculation);
        System.out.println("result = " + result);
    }
}
