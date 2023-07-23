package com.codecool.ftd.logic;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.data.Position;
import com.codecool.ftd.logic.command.Backward;
import com.codecool.ftd.logic.command.Forward;
import com.codecool.ftd.logic.command.Left;
import com.codecool.ftd.logic.command.Movement;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class MovementTest {
    Set<Movement> movements = Set.of(
            new Forward(),
            new Backward(),
            new Left()
    );
    MovementEngine movementEngine = new MovementEngine(movements);

    public static Stream<Arguments> parameters() {
        return Stream.of(
                // Sprint #1
                of(new Position(1, 0, 0), new Position(0, 0, 0), "FORWARD"),
                of(new Position(2, 0, 0), new Position(1, 0, 0), "FORWARD"),
                of(new Position(0, 0, 0), new Position(-1, 0, 0), "FORWARD"),

                of(new Position(-1, 0, 0), new Position(0, 0, 0), "BACKWARD"),
                of(new Position(-2, 0, 0), new Position(-1, 0, 0), "BACKWARD"),
                of(new Position(0, 0, 0), new Position(1, 0, 0), "BACKWARD"),

                of(new Position(0, -1, 0), new Position(0, 0, 0), "LEFT"),
                of(new Position(0, -2, 0), new Position(0, -1, 0), "LEFT"),
                of(new Position(0, 0, 0), new Position(0, 1, 0), "LEFT"),

                of(new Position(0, 1, 0), new Position(0, 0, 0), "RIGHT"),
                of(new Position(0, 2, 0), new Position(0, 1, 0), "RIGHT"),
                of(new Position(0, 0, 0), new Position(0, -1, 0), "RIGHT"),

                // Sprint #2
                of(new Position(1, -1, 0), new Position(0, 0, 0), "FORWARD-LEFT"),
                of(new Position(2, -2, 0), new Position(1, -1, 0), "FORWARD-LEFT"),
                of(new Position(0, 0, 0), new Position(-1, 1, 0), "FORWARD-LEFT"),

                of(new Position(1, 1, 0), new Position(0, 0, 0), "FORWARD-RIGHT"),
                of(new Position(2, 2, 0), new Position(1, 1, 0), "FORWARD-RIGHT"),
                of(new Position(0, 0, 0), new Position(-1, -1, 0), "FORWARD-RIGHT"),

                of(new Position(-1, -1, 0), new Position(0, 0, 0), "BACKWARD-LEFT"),
                of(new Position(-2, -2, 0), new Position(-1, -1, 0), "BACKWARD-LEFT"),
                of(new Position(0, 0, 0), new Position(1, 1, 0), "BACKWARD-LEFT"),

                of(new Position(-1, 1, 0), new Position(0, 0, 0), "BACKWARD-RIGHT"),
                of(new Position(-2, 2, 0), new Position(-1, 1, 0), "BACKWARD-RIGHT"),
                of(new Position(0, 0, 0), new Position(1, -1, 0), "BACKWARD-RIGHT"),

                // Sprint #3
                of(new Position(0, 0, 1), new Position(0, 0, 0), "UP"),
                of(new Position(0, 0, 2), new Position(0, 0, 1), "UP"),
                of(new Position(0, 0, 0), new Position(0, 0, -1), "UP"),

                of(new Position(0, 0, -1), new Position(0, 0, 0), "DOWN"),
                of(new Position(0, 0, -2), new Position(0, 0, -1), "DOWN"),
                of(new Position(0, 0, 0), new Position(0, 0, 1), "DOWN")
        );
    }


    @ParameterizedTest
    @MethodSource("parameters")
    void move(Position expected, Position current, String command) {
        Drone drone = new Drone(current);

        movementEngine.move(drone, command);

        Position result = drone.getPosition();
        assertEquals(expected, result);
    }

}
