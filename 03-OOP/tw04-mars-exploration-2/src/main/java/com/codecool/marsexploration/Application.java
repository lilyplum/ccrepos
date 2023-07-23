package com.codecool.marsexploration;

import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.SimulationInput;
import com.codecool.marsexploration.logic.ExplorationSimulator;
import com.codecool.marsexploration.logic.analyzer.*;
import com.codecool.marsexploration.logic.phase.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
        ResourceService resourceService = new ResourceService();

        List<Analyzer> analyzers = new ArrayList<>();
        analyzers.add(new TimeoutAnalyzer());
        analyzers.add(new AlienAnalyzer());
        analyzers.add(new LackOfResourceAnalyzer(resourceService));
        analyzers.add(new SuccessAnalyzer(resourceService));

        List<Phase> phases = new ArrayList<>();
        phases.add(new Movement());
        phases.add(new Scan());
        phases.add(new Analysis(analyzers));
        phases.add(new Log());
        phases.add(new StepIncrement());

        ExplorationSimulator simulator = new ExplorationSimulator(phases);
        SimulationInput input = new SimulationInput(
                "src/main/resources/exploration-2.map",
                new Coordinate(17, 17),
                300,
                "src/main/resources/exploration.log");
        simulator.simulate(input);
    }
}
