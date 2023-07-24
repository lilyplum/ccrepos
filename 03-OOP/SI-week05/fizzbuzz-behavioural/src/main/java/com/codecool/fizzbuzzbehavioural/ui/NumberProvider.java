package com.codecool.fizzbuzzbehavioural.ui;

import java.util.Scanner;

public class NumberProvider {
    private final Scanner scanner;

    public NumberProvider(Scanner scanner) {
        this.scanner = scanner;
    }

    public int provide() {
        System.out.print("Provide a number to FizzBuzz: ");
        return scanner.nextInt();
    }
}
