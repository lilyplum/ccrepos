package com.codecool.RoboDog.model;

import java.util.Objects;

public record Dog(String name, int age, Breed breed) {
    @Override
    public String toString() {
        return "Dog[" +
                "name=" + name + ", " +
                "age=" + age + ", " +
                "breed=" + breed + ']';
    }

}
