package com.codecool.marsexploration.logic;

import com.codecool.marsexploration.data.*;
import com.codecool.marsexploration.io.MapReader;
import com.codecool.marsexploration.logic.phase.Phase;
import com.codecool.marsexploration.logic.routine.ExploringRoutine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExplorationSimulator {

    private final List<Phase> phases;

    public ExplorationSimulator(List<Phase> phases) {
        this.phases = phases;
    }


    public void simulate(SimulationInput input) throws IOException {
        List<Coordinate> trackRecords = new ArrayList<>();
        Map<Coordinate, Symbol> exploredObjects = new HashMap<>();
        long timeout = input.timeout();
        String mapPath = input.mapPath();
        Coordinate landing = input.landing();
        String logFile = input.logPath();

        MapReader mapReader = new MapReader();
        List<List<Symbol>> map = mapReader.read(mapPath);

        Context context = new Context(
                0,
                timeout,
                map,
                landing,
                new Rover(
                        1,
                        landing,
                        1,
                        new ExploringRoutine(),
                        trackRecords,
                        exploredObjects),
                null,
                logFile
        );


        do {
            for (Phase phase : phases) {
                phase.perform(context);
            }
        } while (context.getExplorationOutcome() == null);
    }

}
