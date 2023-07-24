package com.codecool.image.logic;

import com.codecool.image.logic.processor.Processor;
import com.codecool.image.io.ImageReader;
import com.codecool.image.io.ImageWriter;

import java.awt.image.BufferedImage;

public class ImageProcessor {
    private final ImageReader reader;
    private final ImageWriter writer;

    public ImageProcessor(ImageReader reader, ImageWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void process(String source, String destination, Processor processor) {
        BufferedImage original = reader.read(source);
        BufferedImage altered = original;
        altered = processor.process(altered);
        writer.write(altered, destination, "jpg");
    }
}
