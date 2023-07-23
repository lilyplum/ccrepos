package com.codecool.RoboDog.controller;

import com.codecool.RoboDog.model.Dog;
import com.codecool.RoboDog.service.DogCreator;
import com.codecool.RoboDog.service.DogStorage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dogs")
public class DogController {

    private final DogStorage dogStorage;

    private final DogCreator dogCreator;

    public DogController(DogStorage dogStorage, DogCreator dogCreator) {
        this.dogStorage = dogStorage;
        this.dogCreator = dogCreator;
    }

    @GetMapping
    public List<Dog> readAll() {
        return dogStorage.readAll();
    }

    @GetMapping({"/random"})
    public Dog createRandomDog () {
        return dogCreator.createRandomDog();
    }

    @GetMapping("{name}")
    public Dog readOneByName(@PathVariable String name) throws DogNotFoundException {
        return dogStorage.readOneByName(name)
                .orElseThrow(DogNotFoundException::new);
    }

    @PostMapping
    public Dog create(@RequestBody Dog dog) {
        dogStorage.create(dog);
        return dog;
    }


    @PatchMapping
    public Dog update(@RequestBody Dog dog) {
        return dogStorage.update(dog);
    }

}

