package com.codecool.image.ui.menu;

import com.codecool.image.logic.ImageProcessor;
import com.codecool.image.ui.Display;
import com.codecool.image.ui.Input;

public class ImageMenu {
    public static final String PROCESSED_IMAGE_PATH = "src/main/resources/processed/";
    private final Display display;
    private final Input input;
    private final ImageProcessor imageProcessor;

    public ImageMenu(Display display, Input input, ImageProcessor imageProcessor) {
        this.display = display;
        this.input = input;
        this.imageProcessor = imageProcessor;
    }

    public void run(String sourcePath){
        boolean isRunning = true;
        while (isRunning) {
            display.printMenu();
            int menuItemIndex = input.getNumericUserInput("Please select a menu item!");
            isRunning = invokeMenuItem(menuItemIndex, sourcePath);
        }
    }


    private boolean invokeMenuItem(int selectedMenu, String source) {
        String destination = getImageDestination(source);
        display.message("Loading...");
        switch (selectedMenu) {
            case 0 -> {
                return false;
            }
            case 1 -> resize(source, destination);
            case 2 -> grayScale(source, destination);
            case 3 -> cropImage(source, destination);
            case 4 -> enhanceRedColor(source, destination);
            case 5 -> swapColor(source, destination);
            default -> display.errorMessage("Invalid menu item selected!\n");
        }
        return true;
    }

    private String getImageDestination(String source) {
        var s = source.split("/");
        return PROCESSED_IMAGE_PATH + s[s.length-1];
    }


    private void resize(String source, String destination) {
        // Here you should call the processor for Resizing

        notifyProcessCompleted("Image resizing completed!");
    }

    private void grayScale(String source, String destination) {
        // Here you should call the processor for GrayScale

        notifyProcessCompleted("Gray scaling completed!");
    }

    private void cropImage(String source, String destination) {
        // Here you should call the processor for Image cropping

        notifyProcessCompleted("Image cropping completed!");
    }

    private void enhanceRedColor(String source, String destination) {
        // Here you should call the processor for Red color enhancing

        notifyProcessCompleted("Red color enhancing completed!");
    }

    private void swapColor(String source, String destination) {
        boolean isRunning = true;
        while (isRunning) {
            display.printColorSwapMenu();
            int menuItemIndex = input.getNumericUserInput("Please select a menu item!");
            isRunning = invokeSwapMenuItem(menuItemIndex, source, destination);
        }
    }

    private boolean invokeSwapMenuItem(int selectedMenu, String source, String destination) {
        switch (selectedMenu) {
            case 0 -> {
                return false;
            }
            case 1 -> swapRedWithBlue(source, destination);
            case 2 -> swapRedWithGreen(source, destination);
            default -> display.errorMessage("Invalid menu item selected!\n");
        }
        return true;
    }

    private void swapRedWithBlue(String source, String destination) {
        // Here you should call the processor for Red - Blue color swapping

        notifyProcessCompleted("Swapping completed!");
    }

    private void swapRedWithGreen(String source, String destination) {
        // Here you should call the processor for Red - Green color swapping

        notifyProcessCompleted("Swapping completed!");
    }

    private void notifyProcessCompleted(String message) {
        display.message(message);
    }

}
