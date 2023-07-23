package com.codecool.ftd.logic;

import com.codecool.ftd.data.Drone;
import com.codecool.ftd.logic.movement.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MovementEngine {
    private final Map<String, MovementInterface> movements = new HashMap<>();

    public MovementEngine () {
        movements.put("forward", new ForwardMovement());
        movements.put("backward", new BackwardMovement());
        movements.put("left", new LeftMovement());
        movements.put("right",new RightMovement());
        movements.put("fl", new ForwardLeftMovement());
        movements.put("fr", new ForwardRightMovement());
        movements.put("bl", new BackwardLeftMovement());
        movements.put("br", new BackwardRightMovement());
        movements.put("up", new UpMovement());
        movements.put("down", new DownMovement());
    }

    public void move(Drone drone, String command) {
        MovementInterface movement = movements.get(command);
        if (movement != null) {
            movement.move(drone);
        } else {
            System.out.println("Invalid command: " + command);
        }
    }

    public Set<String> getCommands() {
        return movements.keySet();
    }
}
