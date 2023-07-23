package com.codecool.marsexploration.logic.analyzer;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Outcome;
import com.codecool.marsexploration.data.Symbol;

import java.util.Optional;

public class AlienAnalyzer implements Analyzer{
    @Override
    public Optional<Outcome> analyze(Context context) {
        if(context.getRover().getExploredObjects().containsValue(Symbol.ALIEN)){
            return Optional.of(Outcome.ALIEN_FIRST_CONTACT);
        }
        return Optional.empty();
    }
}
