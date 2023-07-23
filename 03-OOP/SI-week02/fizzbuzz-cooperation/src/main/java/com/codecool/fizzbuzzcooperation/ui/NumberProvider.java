package com.codecool.fizzbuzzcooperation.ui;

import java.util.Scanner;

public class NumberProvider {
    Scanner userInput = new Scanner(System.in);
    public int provide() {
        int number = userInput.nextInt();
        return number;
    }
}
