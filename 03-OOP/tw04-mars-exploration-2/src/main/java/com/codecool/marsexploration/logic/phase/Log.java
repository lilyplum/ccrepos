package com.codecool.marsexploration.logic.phase;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Coordinate;
import com.codecool.marsexploration.data.Outcome;
import com.codecool.marsexploration.data.Rover;
import com.codecool.marsexploration.io.LogWriter;

public class Log implements Phase {
    private String log;

    @Override
    public void perform(Context context) {
        LogWriter logWriter = new LogWriter();
        String logPath = context.getLogFile();
        int stepNumber = context.getStepNumber();
        Rover rover = context.getRover();
        Coordinate position = rover.getPosition();

        log = String.format(
                "STEP %d; EVENT position; UNIT rover-%d; POSITION [%d,%d]",
                stepNumber, rover.getId(), position.x(), position.y()
        );
        logWriter.write(logPath, log);

        if (context.getExplorationOutcome() != null) {
            Outcome outcome = context.getExplorationOutcome();
            log = String.format(
                    "STEP %d; EVENT outcome; OUTCOME %s",
                    stepNumber, outcome.name()
            );
            logWriter.write(logPath, log);
        }
    }
}
