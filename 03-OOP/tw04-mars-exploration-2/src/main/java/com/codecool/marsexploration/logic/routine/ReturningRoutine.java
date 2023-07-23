package com.codecool.marsexploration.logic.routine;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.Rover;

public class ReturningRoutine implements Routine {
    @Override
    public void move(Context context) {
        int landingX = context.getLanding().x();
        int landingY = context.getLanding().y();
        Coordinate landingCoordinates = new Coordinate(landingX, landingY);
        context.getRover().setPosition(landingCoordinates);
    }
}
