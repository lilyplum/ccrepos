package com.codecool.fengshui.logic;

import com.codecool.fengshui.data.Persona;
import com.codecool.fengshui.data.Sign;

import static com.codecool.fengshui.data.Sign.*;

public class PersonaProvider {
    private final Persona[] personas = {
            new Persona(RAT, new Sign[]{DRAGON, MONKEY, RAT}, new Sign[]{HORSE, GOAT}),
            new Persona(OX, new Sign[]{SNAKE, ROOSTER, OX}, new Sign[]{GOAT, HORSE}),
            new Persona(TIGER, new Sign[]{HORSE, DOG, TIGER}, new Sign[]{MONKEY, SNAKE}),
            new Persona(RABBIT, new Sign[]{PIG, GOAT, RABBIT}, new Sign[]{ROOSTER, DRAGON}),
            new Persona(DRAGON, new Sign[]{RAT, MONKEY, DRAGON}, new Sign[]{DOG, RABBIT}),
            new Persona(SNAKE, new Sign[]{OX, ROOSTER, SNAKE}, new Sign[]{PIG, TIGER}),
            new Persona(HORSE, new Sign[]{DOG, TIGER, HORSE}, new Sign[]{RAT, OX}),
            new Persona(GOAT, new Sign[]{RABBIT, PIG, GOAT}, new Sign[]{OX, RAT}),
            new Persona(MONKEY, new Sign[]{DRAGON, RAT, MONKEY}, new Sign[]{TIGER, PIG}),
            new Persona(ROOSTER, new Sign[]{OX, SNAKE, ROOSTER}, new Sign[]{RABBIT, DOG}),
            new Persona(DOG, new Sign[]{TIGER, HORSE, DOG}, new Sign[]{DRAGON, ROOSTER}),
            new Persona(PIG, new Sign[]{RABBIT, GOAT, PIG}, new Sign[]{SNAKE, MONKEY})
    };

    public Persona findPersona(Sign sign) {
        for (Persona persona : personas) {
            if (persona.sign() == sign) {
                return persona;
            }
        }
        throw new IllegalArgumentException("No persona found for sign: " + sign);
    }
}
