package com.codecool.ftd.logic.command;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForwardTest {
    Movement movement = new Forward();

    @Test
    void getName() {
        String result = movement.getCommand();

        String expected = "FORWARD";
        assertEquals(expected, result);
    }

    @Test
    void move() {
        Drone drone = new Drone(new Position(0, 0, 0));

        movement.apply(drone);
        Position result = drone.getPosition();

        Position expected = new Position(0, 0, 1);
        assertEquals(expected, result);
    }
}