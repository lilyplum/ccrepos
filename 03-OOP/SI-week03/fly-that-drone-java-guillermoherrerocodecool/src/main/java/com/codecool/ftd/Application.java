package com.codecool.ftd;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;
import com.codecool.ftd.logic.MovementEngine;
import com.codecool.ftd.logic.command.Backward;
import com.codecool.ftd.logic.command.Left;
import com.codecool.ftd.logic.command.Movement;
import com.codecool.ftd.logic.command.Forward;
import com.codecool.ftd.ui.FlyThatDroneUi;

import java.util.Scanner;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Position startingPosition = new Position(0, 0, 0);
        Drone drone = new Drone(startingPosition);
        Set<Movement> movements = Set.of(
                new Forward(),
                new Backward(),
                new Left()
        );
        MovementEngine movementEngine = new MovementEngine(movements);
        Scanner scanner = new Scanner(System.in);
        FlyThatDroneUi flyThatDroneUi = new FlyThatDroneUi(drone, movementEngine, movements, scanner);
        flyThatDroneUi.start();
    }
}
