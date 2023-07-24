package com.codecool.image;

import com.codecool.image.ui.menu.FileSelectorMenu;
import com.codecool.image.ui.menu.ImageMenu;

public class ImageProcessorApplication {
    private final ImageMenu handler;
    private final FileSelectorMenu fileSelector;

    public ImageProcessorApplication(ImageMenu handler, FileSelectorMenu selector) {
        this.handler = handler;
        this.fileSelector = selector;
    }

    public void run() {
        String filePath = fileSelector.selectFile();
        handler.run(filePath);
    }

}
