package com.codecool.ehotel.ui;

import com.codecool.ehotel.service.breakfast.Breakfast;
import com.codecool.ehotel.service.breakfast.BreakfastManager;

import java.util.Scanner;

public class Input {
    public String getInput() {
        Scanner input = new Scanner(System.in);
        String result = input.nextLine().trim();
        return result;
    }
}
