package com.codecool.image.ui.menu;

import com.codecool.image.ui.Display;
import com.codecool.image.ui.Input;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSelectorMenu {
    private final Display display;
    private final Input input;
    private List<String> listOfFiles;

    public FileSelectorMenu(Display display, Input input) {
        this.display = display;
        this.input = input;
        listOfFiles = new ArrayList<>();
        updateListOfFiles();
    }

    public String selectFile() {
        boolean isValidFile = false;
        int fileIndex = 0;
        while (!isValidFile) {
            display.message("Available files:");
            display.printImagePaths(listOfFiles);
            fileIndex = input.getNumericUserInput("Please select a file!");
            isValidFile = isValidFile(fileIndex);
        }
        return listOfFiles.get(fileIndex);
    }

    private boolean isValidFile(int selected) {
        if(listOfFiles.size() > selected
                && 0 <= selected){
            return true;
        }
        return false;
    }

    private void updateListOfFiles() {
        File folder = new File("src/main/resources/example");
        File[] folderContent = folder.listFiles();
        listOfFiles = new ArrayList<>();
        for (int i = 0; i < folderContent.length; ++i){
            if(folderContent[i].isFile())
                listOfFiles.add(folderContent[i].getPath());
        }
    }
}
