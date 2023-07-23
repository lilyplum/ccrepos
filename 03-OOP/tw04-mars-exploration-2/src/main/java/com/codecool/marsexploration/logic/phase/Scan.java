package com.codecool.marsexploration.logic.phase;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.Symbol;

import java.util.List;
import java.util.Map;

public class Scan implements Phase {
    @Override
    public void perform(Context context) {
        Coordinate rover = context.getRover().getPosition();
        int roverX = context.getRover().getPosition().x();
        int roverY = context.getRover().getPosition().y();
        int sight = context.getRover().getSight();

        List<List<Symbol>> map = context.getMap();
        List<Coordinate> trackRecords = context.getRover().getTrackRecords();
        trackRecords.add(rover);
        Map<Coordinate, Symbol> exploredResources = context.getRover().getExploredObjects();

        for (int x = roverX - sight; x <= roverX + sight; x++) {
            for (int y = roverY - sight; y <= roverY + sight; y++) {

                //skip out of bounds
                if (x < 0 || y < 0 || x >= map.size() || y >= map.get(x).size()) {
                    continue;
                }

                Symbol symbol = map.get(y).get(x);
                if (symbol != Symbol.EMPTY && symbol != Symbol.MOUNTAIN && symbol != Symbol.PIT) {
                    exploredResources.put(new Coordinate(x, y), symbol);
                }
            }
        }
    }
}
