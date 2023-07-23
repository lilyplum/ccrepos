package com.codecool.marsexploration.logic.phase;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Outcome;
import com.codecool.marsexploration.logic.analyzer.Analyzer;
import com.codecool.marsexploration.logic.routine.ReturningRoutine;

import java.util.List;
import java.util.Optional;

public class Analysis implements Phase {

    private final List<Analyzer> analyzers;

    public Analysis(List<Analyzer> analyzers) {
        this.analyzers = analyzers;
    }

    @Override
    public void perform(Context context) {
        for (Analyzer analyzer : analyzers) {
            Optional<Outcome> outcome = analyzer.analyze(context);
            if (outcome.isPresent()) {
                System.out.println(outcome);
                context.setExplorationOutcome(outcome.get());
                context.getRover().setRoutine(new ReturningRoutine());
                break;
            }
        }
    }
}
