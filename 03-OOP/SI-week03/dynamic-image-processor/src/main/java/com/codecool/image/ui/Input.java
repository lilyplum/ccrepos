package com.codecool.image.ui;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Input {
    private final Display display;

    public Input(Display display) {
        this.display = display;
    }


    public int getNumericUserInput(String message) {
        int result = -1;
        while(result < 0){
            display.message(message);
            try {
                Scanner scanner = new Scanner(System.in);
                result = scanner.nextInt();
            }
            catch (NoSuchElementException e){
                display.errorMessage("Invalid input!");
            }
        }
        return result;

    }

    public String getStringUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        display.message(message);
        return scanner.nextLine();
    }
}
