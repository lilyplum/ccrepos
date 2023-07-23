package com.codecool.ftd.logic.command;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;

public class Left implements Movement {
    @Override
    public String getCommand() {
        return "LEFT";
    }

    @Override
    public void apply(Drone drone) {
        Position current = drone.getPosition();
        Position updated = new Position(
                current.x(),
                current.y() - 1,
                current.z()
        );
        drone.setPosition(updated);
    }
}
