package com.codecool.chessmovements.logic;

import com.codecool.chessmovements.data.Position;

public class ChessBoardBoundaries {
    private final int size;

    public ChessBoardBoundaries(int size) {
        this.size = size;
    }

    public boolean fits(Position position) {
        return fits(position.x()) && fits(position.y());
    }

    private boolean fits(int coordinate) {
        return coordinate >= 0 && coordinate < size;
    }
}
