package com.codecool.RoboDog.service;

import com.codecool.RoboDog.model.Dog;

import java.util.List;
import java.util.Optional;

public class DogStorage {
    private final List<Dog> dogs;

    public DogStorage(List<Dog> dogs) {
        this.dogs = dogs;
    }

    public void create(Dog dog) {
        dogs.add(dog);
    }


    public List<Dog> readAll() {
        return dogs;
    }

    public Optional<Dog> readOneByName(String name) {
        return dogs.stream()
                .filter(dog -> dog.name().equals(name))
                .findFirst();
    }

    public Dog update(Dog dog) {
        delete(dog.name());
        dogs.add(dog);
        return dog;
    }

    public void delete(String name) {
        dogs.removeIf(existing -> existing.name().equals(name));
    }
}
