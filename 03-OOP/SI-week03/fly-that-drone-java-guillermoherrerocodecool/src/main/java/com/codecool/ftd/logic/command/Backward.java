package com.codecool.ftd.logic.command;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;

public class Backward implements Movement {
    @Override
    public String getCommand() {
        return "BACKWARD";
    }

    @Override
    public void apply(Drone drone) {
        Position current = drone.getPosition();
        Position updated = new Position(
                current.x() - 1,
                current.y(),
                current.z()
        );
        drone.setPosition(updated);
    }
}
