package com.codecool.elevator;

public class InsideRequest implements Request {
    private Direction direction;
    private int floor;

    public InsideRequest(Direction direction, int floor) {
        this.direction = direction;
        this.floor = floor;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getFloor() {
        return floor;
    }
}
