package com.codecool.RoboDog.configuration;

import com.codecool.RoboDog.model.Dog;
import com.codecool.RoboDog.service.DogCreator;
import com.codecool.RoboDog.service.DogStorage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BeansConfig {
    @Bean
    DogStorage dogStorage() {
        return new DogStorage(new ArrayList<>());
    }

    @Bean
    DogCreator dogCreator() {
        return new DogCreator();
    }
}
