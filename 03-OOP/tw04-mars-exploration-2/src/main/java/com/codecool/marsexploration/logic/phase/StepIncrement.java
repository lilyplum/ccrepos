package com.codecool.marsexploration.logic.phase;

import com.codecool.marsexploration.data.Context;

public class StepIncrement implements Phase {
    @Override
    public void perform(Context context) {
        int currentStepNumber = context.getStepNumber();
        context.setStepNumber(currentStepNumber + 1);
    }
}
