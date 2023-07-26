package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

public class AdvanceTextClass {
    public static void advanceText() {
        Display display = new Display();
        Input input = new Input();
        display.printMessage("\n Press Enter to continue");
        input.getInputFromUser();
    }
}