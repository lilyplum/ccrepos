package com.codecool.ehotel.model.buffetData;
import java.time.LocalDateTime;
import java.util.*;

public class Buffet {
    private Map<MealType, List<LocalDateTime>> mealPortions;

    public Buffet(Map<MealType, List<LocalDateTime>> mealPortions) {
        this.mealPortions = mealPortions;
    }

    public Map<MealType, List<LocalDateTime>> mealPortions() {
        return mealPortions;
    }

    @Override
    public String toString() {
        return "Buffet[" +
                "mealPortions=" + mealPortions + ']';
    }

    public void setMealPortions(Map<MealType, List<LocalDateTime>> mealPortions) {
        this.mealPortions = mealPortions;
    }
}
