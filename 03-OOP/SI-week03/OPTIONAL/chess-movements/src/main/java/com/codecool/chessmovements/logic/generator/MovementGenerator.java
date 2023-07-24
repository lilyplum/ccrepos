package com.codecool.chessmovements.logic.generator;

import com.codecool.chessmovements.data.Position;

import java.util.List;

public interface MovementGenerator {
    List<Position> generate(Position current);

    String getType();
}
