package com.codecool.ftd.logic.movement;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;

public class RightMovement implements MovementInterface {
    @Override
    public void move(Drone drone) {
        Position currentPosition = drone.getPosition();
        Position newPosition = new Position(currentPosition.x() + 1, currentPosition.y(), currentPosition.z());
        drone.setPosition(newPosition);
    }
}
