package com.codecool.mightytextadventure.data;

public enum RiddlesAnswers {

    ANSWER1("stamp"),
    ANSWER2("library"),
    ANSWER3("cold");

    private final String answer;

    RiddlesAnswers(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }
}

