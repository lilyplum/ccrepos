package com.codecool.pokemonminmax.logic.provider.mapper;

import com.codecool.pokemonminmax.data.Pokemon;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class PokemonMapper implements Mapper<Pokemon> {

    @Override
    public Pokemon map(String[] line) {
        return new Pokemon(
                Integer.parseInt(line[0]),
                line[1],
                line[2],
                line[3],
                line[4],
                Double.parseDouble(line[5]),
                Double.parseDouble(line[6]),
                Double.parseDouble(getPercentage(line[7])),
                getTypeAdvantages(line[8]),
                getTypeAdvantages(line[9]),
                getListOfElements(line[10]));
    }

    private Map<Double, List<String>> getTypeAdvantages(String advantage){
        return Arrays.stream(advantage.split("],"))
                .map(this::getAdvantage)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private List<String> getListOfElements(String attacks) {
        if(attacks.equals("[]"))
            return new ArrayList<>();
        return getStringsBetween(attacks, "'(.*?)'");
    }

    private Map.Entry<Double, List<String>> getAdvantage(String advString) {
        if(advString.equalsIgnoreCase("N/A"))
            return Map.entry(0.0,new ArrayList<>());

        String[] advantage = advString.split(":");
        String percentage = getPercentage(advantage[0]);
        List<String> types = getStringsBetween(advantage[1], "'(.*?)'");
        return Map.entry(Double.parseDouble(percentage), types);
    }

    private String getPercentage(String str){
        String percentage = str.replaceAll("[^0-9.]", "");
        return percentage.isEmpty() ? "0.0" : percentage;
    }

    private List<String> getStringsBetween(String text, String regex){
        List<String> result = new LinkedList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            result.add(matcher.group());
        }
        return result;
    }

}
