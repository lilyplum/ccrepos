package com.codecool.languageinternationalization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String originalFile = "src/main/resources/german-example.txt";
        String internationalizedFile = "src/main/resources/internationalized.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(originalFile));
             FileWriter writer = new FileWriter(internationalizedFile)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String modifiedLine = line
                        .replaceAll("ö", "oe")
                        .replaceAll("ü", "ue")
                        .replaceAll("ä", "ae")
                        .replaceAll("ß", "ss")
                        .replaceAll("Ö", "Oe")
                        .replaceAll("Ü", "Ue")
                        .replaceAll("Ä", "Ae");
                writer.write(modifiedLine + "\n");
            }
            System.out.println("Internationalized text saved to " + internationalizedFile);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
