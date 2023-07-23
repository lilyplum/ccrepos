package com.codecool.fengshui.logic;
import com.codecool.fengshui.data.Persona;
import com.codecool.fengshui.data.Sign;

public class MathCalculator {

    public static String Math(Sign sign1, Sign sign2) {
        PersonaProvider provider = new PersonaProvider();
        Persona persona = provider.findPersona(sign1);

        Sign[] goodMatches = persona.good();
        Sign[] badMatches = persona.bad();

        for (int i = 0; i < goodMatches.length; i++) {
            if (sign2 == goodMatches[i]) {
                return "good";
            }
        }

        for (int i = 0; i < badMatches.length; i++) {
            if (sign2 == badMatches[i]) {
                return "bad";
            }
        }

        return "average";
    }
}
