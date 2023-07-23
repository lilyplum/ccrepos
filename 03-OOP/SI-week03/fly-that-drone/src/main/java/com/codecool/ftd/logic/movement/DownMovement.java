package com.codecool.ftd.logic.movement;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;

public class DownMovement implements MovementInterface {
    @Override
    public void move(Drone drone) {
        Position currentPosition = drone.getPosition();
        Position newPosition = new Position(currentPosition.x(), currentPosition.y(), currentPosition.z() - 1);
        drone.setPosition(newPosition);
    }
}
