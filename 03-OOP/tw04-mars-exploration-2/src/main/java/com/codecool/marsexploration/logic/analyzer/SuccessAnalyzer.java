package com.codecool.marsexploration.logic.analyzer;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Outcome;
import com.codecool.marsexploration.data.Symbol;

import java.util.Optional;

public class SuccessAnalyzer implements Analyzer {
    ResourceService resourceService;

    public SuccessAnalyzer(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @Override
    public Optional<Outcome> analyze(Context context) {
        int numberOfMinerals = resourceService.getNumberOfSpecificResource(context, Symbol.MINERAL);
        int numberOfWater = resourceService.getNumberOfSpecificResource(context, Symbol.WATER);


        if (numberOfMinerals >= 3 && numberOfWater >= 2) {
            return Optional.of(Outcome.COLONIZABLE);
        } else if (context.getStepNumber() < 10 && numberOfWater >= 1 && numberOfMinerals >= 1) {
            return Optional.of(Outcome.COLONIZABLE);
        }

        return Optional.empty();
    }
}
