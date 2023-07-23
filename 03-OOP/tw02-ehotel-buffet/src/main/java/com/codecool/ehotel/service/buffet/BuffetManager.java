package com.codecool.ehotel.service.buffet;

import com.codecool.ehotel.model.buffetData.Buffet;
import com.codecool.ehotel.model.buffetData.MealDurability;
import com.codecool.ehotel.model.buffetData.MealType;

import java.time.LocalDateTime;
import java.util.*;

public class BuffetManager implements BuffetService {
    @Override
    public void refillBuffet(Buffet buffet, Map<MealType, Integer> portionsToAdd) {
        LocalDateTime timestamp = LocalDateTime.now();
        Map<MealType, List<LocalDateTime>> updatedMealPortions = new HashMap<>(buffet.mealPortions());
        for (MealType mealType : portionsToAdd.keySet()) {
            List<LocalDateTime> portions = updatedMealPortions.getOrDefault(mealType, new ArrayList<>());
            int numPortions = portionsToAdd.get(mealType);
            for (int i = 0; i < numPortions; i++) {
                portions.add(timestamp);
            }
            updatedMealPortions.put(mealType, portions);
        }
        buffet.setMealPortions(updatedMealPortions);
    }

    @Override
    public boolean consumeFreshest(Buffet buffet, MealType mealType) {
        List<LocalDateTime> portions = buffet.mealPortions().get(mealType);
        if (portions == null || portions.isEmpty()) {
            return false;
        }
        LocalDateTime freshestPortion = Collections.max(portions);
        portions.remove(freshestPortion);
        return true;
    }

    @Override
    public int collectWaste(Buffet buffet, MealDurability mealDurability, LocalDateTime expirationTime) {
        int totalWasteCost = 0;
        Map<MealType, List<LocalDateTime>> portions = buffet.mealPortions();
        for (MealType mealType : portions.keySet()) {
            if (mealType.getDurability() == mealDurability) {
                List<LocalDateTime> mealPortionsTimeStamps = portions.get(mealType);
                System.out.println("mealPortionsTimeStamps = " + mealPortionsTimeStamps);
                Iterator<LocalDateTime> iterator = mealPortionsTimeStamps.iterator();
                while (iterator.hasNext()) {
                    LocalDateTime portionTime = iterator.next();
                    if (portionTime.isBefore(expirationTime)) {
                        iterator.remove();
                        totalWasteCost += mealType.getCost();
                    }
                }
            }
        }
        return totalWasteCost;
    }
}