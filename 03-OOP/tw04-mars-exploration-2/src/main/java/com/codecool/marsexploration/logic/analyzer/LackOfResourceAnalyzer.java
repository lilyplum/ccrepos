package com.codecool.marsexploration.logic.analyzer;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Outcome;
import com.codecool.marsexploration.data.Symbol;

import java.util.Optional;

public class LackOfResourceAnalyzer implements Analyzer {
    ResourceService resourceService;

    public LackOfResourceAnalyzer(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @Override
    public Optional<Outcome> analyze(Context context) {
        int numberOfWater = resourceService.getNumberOfSpecificResource(context, Symbol.WATER);
        int numberOfMineral = resourceService.getNumberOfSpecificResource(context, Symbol.MINERAL);
        if (context.getStepNumber() == 15) {
            if (numberOfMineral == 0 && numberOfWater == 0) {
                return Optional.of(Outcome.NOT_COLONIZABLE_RESOURCES);
            }
        } else if (context.getStepNumber() == 25) {
            if (numberOfMineral < 2 && numberOfWater < 2) {
                return Optional.of(Outcome.NOT_COLONIZABLE_RESOURCES);
            }

        } else if (context.getStepNumber() == 50) {
            if (numberOfMineral < 3 && numberOfWater < 3) {
                return Optional.of(Outcome.NOT_COLONIZABLE_RESOURCES);
            }

        }

        return Optional.empty();
    }


}
