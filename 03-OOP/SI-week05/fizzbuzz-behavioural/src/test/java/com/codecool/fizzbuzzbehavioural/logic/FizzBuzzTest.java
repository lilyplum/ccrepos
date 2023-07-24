package com.codecool.fizzbuzzbehavioural.logic;

import com.codecool.fizzbuzzbehavioural.logic.check.Check;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

class FizzBuzzTest {

    Check check1 = Mockito.mock(Check.class);
    Check check2 = Mockito.mock(Check.class);

    @Test
    void validatesWhenFirstCheckerReturnsTrue() {
        int num = 1;
        Mockito.when(check1.validates(num)).thenReturn(true);
        FizzBuzz fizzBuzz = new FizzBuzz(List.of(check1, check2));

        fizzBuzz.process(num);

        Mockito.verify(check1, Mockito.times(1)).validates(num);
        Mockito.verify(check2, Mockito.times(0)).validates(num);
        Mockito.verify(check1, Mockito.times(1)).getKeyword();
        Mockito.verify(check2, Mockito.times(0)).getKeyword();
    }
}