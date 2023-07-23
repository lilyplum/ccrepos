package com.codecool.marsexploration.data;

import java.util.List;

public class Context {
    private int stepNumber;
    private final long timeout;
    private final List<List<Symbol>> map;
    private final Coordinate landing;
    private final Rover rover;
    private Outcome explorationOutcome;
    private final String logFile;

    public Context(int stepNumber, long timeout, List<List<Symbol>> map, Coordinate landing, Rover rover, Outcome explorationOutcome, String logFile) {
        this.stepNumber = stepNumber;
        this.timeout = timeout;
        this.map = map;
        this.landing = landing;
        this.rover = rover;
        this.explorationOutcome = explorationOutcome;
        this.logFile = logFile;
    }

    public int getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(int stepNumber) {
        this.stepNumber = stepNumber;
    }

    public long getTimeout() {
        return timeout;
    }

    public List<List<Symbol>> getMap() {
        return map;
    }

    public Coordinate getLanding() {
        return landing;
    }

    public Rover getRover() {
        return rover;
    }

    public Outcome getExplorationOutcome() {
        return explorationOutcome;
    }

    public void setExplorationOutcome(Outcome explorationOutcome) {
        this.explorationOutcome = explorationOutcome;
    }

    public String getLogFile() {
        return logFile;
    }

}
