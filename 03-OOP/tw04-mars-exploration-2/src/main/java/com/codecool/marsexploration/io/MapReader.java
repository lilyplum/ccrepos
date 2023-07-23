package com.codecool.marsexploration.io;

import com.codecool.marsexploration.data.Symbol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MapReader {
    public List<List<Symbol>> read(String mapPath) throws IOException {
        List<List<Symbol>> map = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(mapPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                map.add(getRow(line));
            }
        }
        return map;
    }

    private List<Symbol> getRow(String line) {
        List<Symbol> row = new ArrayList<>();
        for (int i = 0; i < line.length(); i++) {
            char character = line.charAt(i);
            Symbol symbol = getSymbolFromChar(character);
            row.add(symbol);
        }
        return row;
    }

    private Symbol getSymbolFromChar(char character) {
        for (Symbol symbol : Symbol.values()) {
            if (symbol.getSymbol().charAt(0) == character) {
                return symbol;
            }
        }
        return Symbol.EMPTY;
    }
}
