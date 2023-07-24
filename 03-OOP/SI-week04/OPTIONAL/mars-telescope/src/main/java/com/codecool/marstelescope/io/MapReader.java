package com.codecool.marstelescope.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MapReader {
    public List<String> readFile(String filePath) throws FileNotFoundException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not load map file. Try placing it in the App's folder or pass the filename as args.");
            throw new FileNotFoundException("Map file not found.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
}
