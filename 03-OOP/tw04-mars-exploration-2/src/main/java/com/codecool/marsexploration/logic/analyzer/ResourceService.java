package com.codecool.marsexploration.logic.analyzer;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.Symbol;

import java.util.Map;

public class ResourceService {
    public int getNumberOfSpecificResource(Context context, Symbol symbol) {
        int countResource = 0;

        for (Map.Entry<Coordinate, Symbol> entry : context.getRover().getExploredObjects().entrySet()) {
            if (entry.getValue() == symbol) {
                countResource++;
            }
        }
        return countResource;
    }
}
