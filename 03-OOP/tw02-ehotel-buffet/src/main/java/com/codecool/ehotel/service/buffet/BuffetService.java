package com.codecool.ehotel.service.buffet;

import com.codecool.ehotel.model.buffetData.Buffet;
import com.codecool.ehotel.model.buffetData.MealDurability;
import com.codecool.ehotel.model.buffetData.MealType;

import java.time.LocalDateTime;
import java.util.Map;

public interface BuffetService {
    void refillBuffet(Buffet buffet, Map<MealType, Integer> portionsPerType);
    boolean consumeFreshest(Buffet buffet, MealType mealType);
    int collectWaste(Buffet buffet, MealDurability mealDurability, LocalDateTime expirationTime);
}
