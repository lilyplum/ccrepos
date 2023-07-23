package com.codecool.marsexploration.logic.analyzer;

import com.codecool.marsexploration.data.Context;
import com.codecool.marsexploration.data.Outcome;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
class TimeoutAnalyzerTest {

Context context = Mockito.mock(Context.class);
    @ParameterizedTest
    @CsvSource({"10,9","10,8","10,7","10,1"})
    void StepsLessThenTimeoutReturnsEmptyOptional(long timeout,int stepnumber) {
        Mockito.when(context.getTimeout()).thenReturn(timeout);
        Mockito.when(context.getStepNumber()).thenReturn(stepnumber);
        TimeoutAnalyzer timeoutAnalyzer = new TimeoutAnalyzer();
        assertEquals(Optional.empty(),timeoutAnalyzer.analyze(context));
    }
    @ParameterizedTest
    @CsvSource({"10,10","9,9","8,8","7,7"})
    void StepsEqualToTimeOutReturnOptionalWithOutcomeTimeOut() {
        Mockito.when(context.getTimeout()).thenReturn(10L);
        Mockito.when(context.getStepNumber()).thenReturn(10);
        TimeoutAnalyzer timeoutAnalyzer = new TimeoutAnalyzer();
        assertEquals(Optional.of(Outcome.TIMEOUT),timeoutAnalyzer.analyze(context));

    }
}