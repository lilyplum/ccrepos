package com.codecool.marsexploration.logic.analyzer;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Outcome;

import java.util.Optional;

public class TimeoutAnalyzer implements Analyzer {

    @Override
    public Optional<Outcome> analyze(Context context) {
        if (context.getTimeout() == context.getStepNumber()) {
            return Optional.of(Outcome.TIMEOUT);
        }

        return Optional.empty();
    }
}
