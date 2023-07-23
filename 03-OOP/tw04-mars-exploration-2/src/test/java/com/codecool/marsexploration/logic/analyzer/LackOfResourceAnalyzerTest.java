package com.codecool.marsexploration.logic.analyzer;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Outcome;
import com.codecool.marsexploration.data.Symbol;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class LackOfResourceAnalyzerTest {

    @ParameterizedTest
    @CsvSource(value = {"0,0,15","1,1,25","2,2,50"})
    void analyzeToReturnOutcomeNotColonizable(int waterNumber,int mineralNumber,int stepNumber) {
        Optional expected = Optional.of(Outcome.NOT_COLONIZABLE_RESOURCES);
        ResourceService resourceService = Mockito.mock(ResourceService.class);
        Context context = Mockito.mock(Context.class);
        LackOfResourceAnalyzer lackOfResourceAnalyzer = new LackOfResourceAnalyzer(resourceService);
        Mockito.when(lackOfResourceAnalyzer.resourceService.getNumberOfSpecificResource(context, Symbol.WATER)).thenReturn(waterNumber);
        Mockito.when(lackOfResourceAnalyzer.resourceService.getNumberOfSpecificResource(context,Symbol.MINERAL)).thenReturn(mineralNumber);
        Mockito.when(context.getStepNumber()).thenReturn(stepNumber);
        assertEquals(expected,lackOfResourceAnalyzer.analyze(context));

    }
    @ParameterizedTest
    @CsvSource(value = {"0,0,14","1,1,24","2,2,49"})
    void analyzeToReturnOptionialEmpty(int waterNumber,int mineralNumber,int stepNumber) {
        Optional expected = Optional.empty();
        ResourceService resourceService = Mockito.mock(ResourceService.class);
        Context context = Mockito.mock(Context.class);
        LackOfResourceAnalyzer lackOfResourceAnalyzer = new LackOfResourceAnalyzer(resourceService);
        Mockito.when(lackOfResourceAnalyzer.resourceService.getNumberOfSpecificResource(context, Symbol.WATER)).thenReturn(waterNumber);
        Mockito.when(lackOfResourceAnalyzer.resourceService.getNumberOfSpecificResource(context,Symbol.MINERAL)).thenReturn(mineralNumber);
        Mockito.when(context.getStepNumber()).thenReturn(stepNumber);
        assertEquals(expected,lackOfResourceAnalyzer.analyze(context));

    }
}