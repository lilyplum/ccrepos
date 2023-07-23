package com.codecool.marsexploration.logic.analyzer;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.Rover;
import com.codecool.marsexploration.data.Symbol;
import com.codecool.marsexploration.logic.routine.ExploringRoutine;
import com.codecool.marsexploration.logic.routine.Routine;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ResourceServiceTest {

    @ParameterizedTest
   @MethodSource
    void getNumberOfSpecificResource(int expected, Symbol symbol) {
        Context context = Mockito.mock(Context.class);
        Map<Coordinate, Symbol> exploredResources = Map.of(new Coordinate(3,4),Symbol.MINERAL,new Coordinate(2,3),Symbol.WATER);
        Rover rover = new Rover(1,new Coordinate(1,1),5,new ExploringRoutine(),null,exploredResources);
        Mockito.when(context.getRover()).thenReturn(rover);
        ResourceService resourceService = new ResourceService();
        Symbol test = symbol;
        assertEquals(expected,resourceService.getNumberOfSpecificResource(context,test));

    }
    static Stream<Arguments> getNumberOfSpecificResource() {
        return Stream.of(Arguments.of(1, Symbol.MINERAL),
                Arguments.of(1, Symbol.WATER));
    }
}