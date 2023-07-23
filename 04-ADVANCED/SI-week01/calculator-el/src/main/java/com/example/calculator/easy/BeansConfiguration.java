package com.example.calculator.easy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

    @Bean
    Punctuation questionMark() {
        return new Punctuation("?");
    }

    @Bean
    Punctuation exclamationMark() {
        return new Punctuation("!");
    }

    @Bean
    Punctuation suspense() {
        return new Punctuation("...");
    }

}
