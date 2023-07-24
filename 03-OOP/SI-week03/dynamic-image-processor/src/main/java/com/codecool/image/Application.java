package com.codecool.image;

import com.codecool.image.io.ImageReader;
import com.codecool.image.io.ImageWriter;
import com.codecool.image.logic.ImageProcessor;
import com.codecool.image.ui.Display;
import com.codecool.image.ui.menu.FileSelectorMenu;
import com.codecool.image.ui.menu.ImageMenu;
import com.codecool.image.ui.Input;

public class Application {
    public static void main(String[] args) {
        ImageReader reader = new ImageReader();
        ImageWriter writer = new ImageWriter();
        ImageProcessor imageProcessor = new ImageProcessor(reader, writer);

        Display display = new Display();
        Input input = new Input(display);
        FileSelectorMenu selector = new FileSelectorMenu(display, input);
        ImageMenu handler = new ImageMenu(display, input, imageProcessor);

        ImageProcessorApplication application = new ImageProcessorApplication(handler, selector);
        application.run();
    }
}
