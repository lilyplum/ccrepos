package com.codecool.image.ui;

import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class Display {
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_DEFAULT = "\u001B[0m";
    private static final Map<String, String> menu;
    private static final Map<String, String> colorSwapMenu;

    static {
        menu = Map.ofEntries(
                entry("1", "Resize image"),
                entry("2", "Grayscale image"),
                entry("3", "Crop image"),
                entry("4", "Enhance red color on image"),
                entry("5", "Swap color"),
                entry("0", "Exit")
        );
        colorSwapMenu = Map.ofEntries(
                entry("1", "Swap red with blue"),
                entry("2", "Swap red with green"),
                entry("0", "Exit")
        );
    }

    public void printMenu() {
        for (Map.Entry<String, String> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void printColorSwapMenu() {
        for (Map.Entry<String, String> entry : colorSwapMenu.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void errorMessage(String message) {
        System.out.println(ANSI_RED + message + ANSI_DEFAULT);
    }

    public void message(String message) {
        System.out.println(message);
    }

    public void printImagePaths(List<String> paths) {
        for (int i = 0; i < paths.size(); ++i) {
            System.out.println(i + " - " + paths.get(i));
        }
    }
}
