package com.codecool.image.logic.processor;

import java.awt.image.BufferedImage;

public interface Processor {
    BufferedImage process(BufferedImage original);
}
