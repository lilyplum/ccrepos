package com.codecool.RoboDog.service;

import com.codecool.RoboDog.model.Breed;
import com.codecool.RoboDog.model.Dog;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DogCreator {

    public Dog createRandomDog() {
        Random random = new Random();

        List<String> names = Arrays.asList("Jim", "Fred", "Baz", "Bing");
        Collections.shuffle(names);

        String name = names.get(0);
        Breed randomBreed = getRandomBreed(random);
        int age = random.nextInt(10 - 1 + 1) + 1;

        return new Dog(name, age, randomBreed);
    }

    private Breed getRandomBreed(Random random) {
        Breed[] breed = Breed.values();
        return breed[random.nextInt(breed.length)];
    }

}
