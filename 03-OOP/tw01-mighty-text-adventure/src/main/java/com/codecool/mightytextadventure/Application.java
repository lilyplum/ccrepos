package com.codecool.mightytextadventure;

import com.codecool.mightytextadventure.data.AreaActions;
import com.codecool.mightytextadventure.logic.Game;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

public class Application {
    public static void main(String[] args) {
        Display display = new Display();
        Input input = new Input();
        AreaActions areaActions = new AreaActions(display, input);
        Game game = new Game(display, input, areaActions);
        game.play();
    }
}