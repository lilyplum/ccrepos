package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.RiddlesAnswers;

public class RiddleChecker {

    public boolean checkAnswer(int riddleNumber, String userInput) {
        String answer = getAnswerForRiddle(riddleNumber);
        return userInput.contains(answer);
    }

    private String getAnswerForRiddle(int riddleNumber) {
        return switch (riddleNumber) {
            case 0 -> RiddlesAnswers.ANSWER1.getAnswer();
            case 1 -> RiddlesAnswers.ANSWER2.getAnswer();
            case 2 -> RiddlesAnswers.ANSWER3.getAnswer();
            default -> throw new IllegalArgumentException("Invalid riddle number");
        };
    }
}

