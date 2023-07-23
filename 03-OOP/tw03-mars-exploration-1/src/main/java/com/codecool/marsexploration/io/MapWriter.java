package com.codecool.marsexploration.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class MapWriter {
    public void write(Stream<String> lines, String filePath) {
        try {
            FileWriter writer = new FileWriter(filePath);
            lines.forEach(line -> {
                try {
                    writer.write(line);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            });
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}