package com.codecool.ftd.ui;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.logic.MovementEngine;
import com.codecool.ftd.logic.command.Movement;

import java.util.Scanner;
import java.util.Set;

import static java.util.stream.Collectors.joining;

public class FlyThatDroneUi {
    private final Drone drone;
    private final MovementEngine movementEngine;
    private final Set<Movement> movements;
    private final Scanner scanner;

    public FlyThatDroneUi(Drone drone, MovementEngine movementEngine, Set<Movement> movements, Scanner scanner) {
        this.drone = drone;
        this.movementEngine = movementEngine;
        this.movements = movements;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            displayMenu();
            handleChoice();
        }
    }

    private void displayMenu() {
        System.out.println("\n*** Fly That Drone ***");
        System.out.println("\nCurrent drone position: " + drone.getPosition());
        System.out.println("Available movements:\n" + getMovementNames());
    }

    private String getMovementNames() {
        return movements.stream()
                .map(Movement::getCommand)
                .collect(joining(", "));
    }

    private void handleChoice() {
        System.out.print("\nChoice: ");
        String choice = scanner.next();
        movementEngine.move(drone, choice);
    }
}
