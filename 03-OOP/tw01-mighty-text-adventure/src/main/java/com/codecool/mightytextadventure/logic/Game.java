package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.AreaActions;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

public class Game {
    private final String YES = "yes";
    private final String NO = "no";
    private final Display display;
    private final Input input;
    private final AreaActions areaActions;

    public Game(Display display, Input input, AreaActions areaActions) {
        this.display = display;
        this.input = input;
        this.areaActions = areaActions;
    }

    public void play() {
        String userName = getUserName();
        boolean wantsToPlay = wantsToPlay(userName);
        if (!wantsToPlay) {
            display.printMessage("Exiting from Mighty Text Adventure! Good Bye!");
            return;
        }
        areaActions.enterStartRoom(userName);
        areaActions.enterRoom1(userName);
        areaActions.enterLastRoom(userName);
    }

    private boolean wantsToPlay(String userName) {
        display.printMessage("Hello " + userName + "!\n" + "Are you ready to start your adventure?\n" +
                "Type 'yes' to start the game or 'no' to exit the game");
        String userAnswer = input.getInputFromUser();
        while (!userAnswer.equalsIgnoreCase(YES) && !userAnswer.equalsIgnoreCase(NO)) {
            display.printMessage("You have to type 'yes' or 'no'!");
            userAnswer = input.getInputFromUser();
        }
        return userAnswer.equalsIgnoreCase("yes");
    }

    private String getUserName() {
        display.printMessage("Hello brave trainer! You are entering a mighty Pokemon text Adventure!");
        display.printMessage("What is your name?");
        return input.getInputFromUser();
    }
}
