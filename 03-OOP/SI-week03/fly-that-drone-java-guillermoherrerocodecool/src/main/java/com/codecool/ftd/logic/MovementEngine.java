package com.codecool.ftd.logic;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.logic.command.Movement;

import java.util.Set;

public class MovementEngine {
    private final Set<Movement> movements;

    public MovementEngine(Set<Movement> movements) {
        this.movements = movements;
    }

    public void move(Drone drone, String command) {
        for (Movement movement : movements) {
            if (movement.getCommand().equals(command)) {
                movement.apply(drone);
                break;
            }
        }
    }
}
