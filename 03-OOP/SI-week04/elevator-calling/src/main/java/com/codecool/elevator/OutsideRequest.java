package com.codecool.elevator;

public class OutsideRequest implements Request {
    private Direction direction;
    private int floor;

    public OutsideRequest(Direction direction, int floor) {
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
