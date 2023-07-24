package com.codecool.chessmovements.logic;

import com.codecool.chessmovements.data.Position;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.of;

class MovementEngineTest {
    int chessBoardSize = 8;
    ChessBoardBoundaries boundaries = new ChessBoardBoundaries(chessBoardSize);

    public static Stream<Arguments> parameters() {
        return Stream.of(
                of(List.of("0,1"), new Position(0, 0), "Pawn"),
                of(List.of("0,7"), new Position(0, 6), "Pawn"),
                of(List.of(), new Position(0, 7), "Pawn"),

                of(List.of("0,1", "1,1", "1,0"), new Position(0, 0), "King"),
                of(List.of("0,0", "1,0", "2,0", "0,1", "2,1", "0,2", "1,2", "2,2"), new Position(1, 1), "King"),
                of(List.of("6,6", "7,6", "6,7"), new Position(7, 7), "King"),

                of(List.of("2,1", "1,2"), new Position(0, 0), "Knight"),
                of(List.of("1,2", "1,4", "2,1", "4,1", "5,2", "5,4", "2,5", "4,5"), new Position(3, 3), "Knight"),
                of(List.of("5,6", "6,5"), new Position(7, 7), "Knight"),

                of(List.of("1,1", "2,2", "3,3", "4,4", "5,5", "6,6", "7,7"), new Position(0, 0), "Bishop"),
                of(List.of("1,6", "2,5", "3,4", "4,3", "5,2", "6,1", "7,0"), new Position(0, 7), "Bishop"),
                of(List.of(
                        "0,0", "1,1", "2,2",
                        "4,2", "5,1", "6,0",
                        "2,4", "1,5", "0,6",
                        "4,4", "5,5", "6,6","7,7"
                ), new Position(3, 3), "Bishop"),

                of(List.of(
                        "0,1", "0,2", "0,3", "0,4", "0,5", "0,6", "0,7",
                        "1,0", "2,0", "3,0", "4,0", "5,0", "6,0", "7,0"
                ), new Position(0, 0), "Rook"),
                of(List.of(
                        "3,2", "3,1", "3,0", "3,4", "3,5", "3,6", "3,7",
                        "2,3", "1,3", "0,3", "4,3", "5,3", "6,3", "7,3"
                ), new Position(3, 3), "Rook"),

                of(List.of(
                        "1,1", "2,2", "3,3", "4,4", "5,5", "6,6", "7,7",
                        "1,0", "2,0", "3,0", "4,0", "5,0", "6,0", "7,0",
                        "0,1", "0,2", "0,3", "0,4", "0,5", "0,6", "0,7"
                ), new Position(0, 0), "Queen"),
                of(List.of(
                        "3,2", "3,1", "3,0", "3,4", "3,5", "3,6", "3,7",
                        "2,3", "1,3", "0,3", "4,3", "5,3", "6,3", "7,3",
                        "2,2", "1,1", "0,0", "4,4", "5,5", "6,6", "7,7",
                        "2,4", "1,5", "0,6", "4,2", "5,1", "6,0"
                ), new Position(3, 3), "Queen")
        );
    }

    private List<Position> parse(List<String> combinations) {
        return combinations.stream()
                .map(combination -> combination.split(","))
                .map(combination -> new Position(Integer.parseInt(combination[0]), Integer.parseInt(combination[1])))
                .toList();
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void generate(List<String> combinations, Position current, String type) {
        List<Position> expected = parse(combinations);

        // To be implemented
    }
}
