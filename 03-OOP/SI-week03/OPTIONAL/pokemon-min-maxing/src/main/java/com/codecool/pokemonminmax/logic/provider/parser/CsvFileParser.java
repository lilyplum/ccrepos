package com.codecool.pokemonminmax.logic.provider.parser;

import com.codecool.pokemonminmax.logic.provider.mapper.Mapper;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CsvFileParser<T> implements Parser<T> {
    private Mapper<T> mapper;

    public CsvFileParser(Mapper<T> mapper) {
        this.mapper = mapper;
    }

    @Override
    public Collection<T> process(String file) {
        Collection<T> dataRow = new ArrayList<>();
        InputStream inputStream = CsvFileParser.class.getResourceAsStream(File.separator+file);
        InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        try (BufferedReader reader = new BufferedReader(streamReader)) {
            String line;
            int lineCounter = 0;
            while ((line = reader.readLine()) != null) {
                if (0 == lineCounter++)
                    continue;

                String[] data = splitCsvLine(line);
                dataRow.add(mapper.map(data));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dataRow;
    }

    private String[] splitCsvLine(String line) {
        List<String> data = new LinkedList<>();
        boolean isStringBlock = false;
        String buffer = "";
        for (int i = 0; i < line.length(); i++) {
            if (!isStringBlock && line.charAt(i) == ',') {
                buffer = sanitise(buffer);
                data.add(buffer);
                buffer = "";
            } else if (line.charAt(i) == '\"') {
                isStringBlock = !isStringBlock;
            } else {
                buffer += line.charAt(i);
            }
        }
        buffer = sanitise(buffer);
        data.add(buffer);
        return data.toArray(String[]::new);
    }

    private String sanitise(String buffer) {
        if ("[]".equals(buffer))
            return "";
        return buffer;
    }
}
