package com.codecool.marsexploration.data;

import com.codecool.marsexploration.logic.routine.Routine;

import java.util.List;
import java.util.Map;

public class Rover {
    private final int id;
    private Coordinate position;
    private final int sight;
    private Routine routine;
    private final List<Coordinate> trackRecords;
    private final Map<Coordinate, Symbol> exploredObjects;

    public Rover(int id, Coordinate position, int sight, Routine routine, List<Coordinate> trackRecords, Map<Coordinate, Symbol> exploredObjects) {
        this.id = id;
        this.position = position;
        this.sight = sight;
        this.routine = routine;
        this.trackRecords = trackRecords;
        this.exploredObjects = exploredObjects;
    }

    public int getId() {
        return id;
    }

    public Coordinate getPosition() {
        return position;
    }

    public void setPosition(Coordinate position) {
        this.position = position;
    }

    public int getSight() {
        return sight;
    }

    public Routine getRoutine() {
        return routine;
    }

    public void setRoutine(Routine routine) {
        this.routine = routine;
    }

    public List<Coordinate> getTrackRecords() {
        return trackRecords;
    }

    public Map<Coordinate, Symbol> getExploredObjects() {
        return exploredObjects;
    }

}
