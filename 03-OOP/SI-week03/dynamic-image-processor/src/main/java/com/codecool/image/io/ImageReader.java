package com.codecool.image.io;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageReader {
    public BufferedImage read(String source) {
        try {
            return doRead(source);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private BufferedImage doRead(String source) throws IOException {
        File file = new File(source);
        return ImageIO.read(file);
    }
}
