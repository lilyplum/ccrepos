package com.codecool.chessmovements.logic;

import com.codecool.chessmovements.data.Position;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class ChessBoardBoundariesTest {
    int chessBoardSize = 2;
    ChessBoardBoundaries boundaries = new ChessBoardBoundaries(chessBoardSize);

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(true, new Position(0, 0)),
                of(true, new Position(1, 0)),
                of(true, new Position(0, 1)),
                of(true, new Position(1, 1)),
                of(false, new Position(-1, 0)),
                of(false, new Position(0, -1)),
                of(false, new Position(-1, -1)),
                of(false, new Position(0, 2)),
                of(false, new Position(2, 0)),
                of(false, new Position(2, 2))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void fits(boolean expected, Position position) {
        boolean result = boundaries.fits(position);

        assertEquals(expected, result);
    }
}
