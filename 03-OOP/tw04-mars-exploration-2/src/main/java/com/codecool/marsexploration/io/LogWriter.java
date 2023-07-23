package com.codecool.marsexploration.io;


import java.io.FileWriter;
import java.io.IOException;

public class LogWriter {
    public void write(String logFile, String line) {
        try {
            FileWriter writer = new FileWriter(logFile, true);
            writer.write(line + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
