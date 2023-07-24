package com.codecool.solararray.model;

import java.time.LocalDate;
import java.util.Arrays;

public class SolarArray {
    private final int numberOfRows;
    private final int lengthOfRow;
    private final Panel[][] panels;

    public SolarArray(int lengthOfRow, int numberOfRows, LocalDate installationDate, PanelType panelType) {
        this.lengthOfRow = lengthOfRow;
        this.numberOfRows = numberOfRows;
        // TODO
    }

    public SolarArray(int lengthOfRow, int numberOfRows, LocalDate installationDate, int[] typeNumbers) {
        this.lengthOfRow = lengthOfRow;
        this.numberOfRows = numberOfRows;
        // TODO
    }

    public Panel[][] getPanels() {
        return panels;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public int getLengthOfRow() {
        return lengthOfRow;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfRows; ++i) {
            for (int j = 0; j < lengthOfRow; ++j) {
                sb.append(String.format("%1$-7s", panels[i][j].getType().getShortName()));
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
