package com.codecool.mightytextadventure.ui;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }
    public String getInputFromUser(){
        return this.scanner.nextLine().trim();
    }

}
