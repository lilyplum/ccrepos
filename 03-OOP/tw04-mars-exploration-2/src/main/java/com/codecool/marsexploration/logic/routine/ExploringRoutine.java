package com.codecool.marsexploration.logic.routine;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.Rover;

import java.util.Random;

public class ExploringRoutine implements Routine {
    Random random = new Random();

    @Override
    public void move(Context context) {
        Rover rover = context.getRover();
        Coordinate roverPos = rover.getPosition();
        int mapSize = context.getMap().size();
        boolean isInsideOfMap = false;

        while (!isInsideOfMap) {
            int deltaX = random.nextInt(3) - 1;
            int deltaY = random.nextInt(3) - 1;
            Coordinate newCoordinate = new Coordinate(roverPos.x() + deltaX, roverPos.y() + deltaY);

            if (newCoordinate.x() >= 0 && newCoordinate.y() >= 0 && newCoordinate.x() < mapSize && newCoordinate.y() < mapSize) {
                rover.setPosition(newCoordinate);
                isInsideOfMap = true;
            }
        }
    }


}