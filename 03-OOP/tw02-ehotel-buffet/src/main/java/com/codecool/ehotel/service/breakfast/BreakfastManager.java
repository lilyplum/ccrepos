package com.codecool.ehotel.service.breakfast;

import com.codecool.ehotel.model.buffetData.Buffet;
import com.codecool.ehotel.model.guestData.Guest;
import com.codecool.ehotel.model.buffetData.MealDurability;
import com.codecool.ehotel.model.buffetData.MealType;
import com.codecool.ehotel.service.buffet.BuffetManager;

import javax.crypto.spec.PSource;
import java.time.LocalDateTime;
import java.util.*;

public class BreakfastManager {
    private final static int NUM_CYCLES = 8;
    private final static int MAX_MEAL_PORTIONS = 6;
    private int TOTAL_WASTE_COST = 0;
    private List<List<Guest>> breakfastCycles;
    private Map<MealType, List<LocalDateTime>> buffetSupply = new HashMap<>();

    public BreakfastManager(List<List<Guest>> breakfastCycles) {
        this.breakfastCycles = breakfastCycles;
    }

    public void serve(){
        System.out.println("Start Breakfast Cycles");
        //TODO: call separately
        fillBreakfastMap();
        for (int i = 0; i < NUM_CYCLES; i++){
            System.out.println("Cycle = " + (i+1));
            System.out.println();

            System.out.println("Buffet state:");
            printBreakfastBuffet();
            refillBuffetSupply();

            System.out.println();
            System.out.println("Refilled buffet supply:");
            printBreakfastBuffet();

            System.out.println();
            System.out.println("Guests consume preferred meal");
            consumeGuestBreakfast();

            System.out.println();
            System.out.println("Buffet state after consuming");
            printBreakfastBuffet();

            System.out.println();
            System.out.println("Discaring rest meals with SHORT durability");
            discardOldMealsAndResetBuffet(i);

            System.out.println("Buffet state after discarding");
            printBreakfastBuffet();
            System.out.println();
        }
        discardOldMealsAtEndOfDay();
        System.out.println("Total waste cost = " + TOTAL_WASTE_COST);
        printBreakfastBuffet();
    }


    public void refillBuffetSupply(){
        for (Map.Entry<MealType, List<LocalDateTime>> meal : buffetSupply.entrySet()){
            if (meal.getValue() == null){
                buffetSupply.put(meal.getKey(), fillFoodWithMaxMealPortions());
            }
            else if (meal.getValue().size() < MAX_MEAL_PORTIONS){
                buffetSupply.put(meal.getKey(), fillFoodWithMaxMealPortions());
            }
        }
    }


    private void consumeGuestBreakfast() {
        for (List<Guest> cycle: breakfastCycles){
            for (Guest guest : cycle){
                MealType preferredMeal = guest.getPreferredMeal();
                BuffetManager buffetManager = new BuffetManager();
                Buffet buffet = new Buffet(buffetSupply);
                if (buffetManager.consumeFreshest(buffet, preferredMeal)) {
                    System.out.println("consumed preferred meal");
                } else {
                    System.out.println("couldnt consume");
                    guest.goHungry();
                }

            }
        }
    }

    private void discardOldMealsAtEndOfDay(){
        for (Map.Entry<MealType, List<LocalDateTime>> meal : buffetSupply.entrySet()) {
            //TODO: below if could be a separate function for all discards
            if (meal.getKey().getDurability() != MealDurability.LONG) {
                List<LocalDateTime> mealPortionTimeStamps = buffetSupply.get(meal.getKey());

                // TODO: CHECK - you could use a "normal" loop but just go through from
                // back to front - also check how to remove elements with stream
                Iterator<LocalDateTime> iterator = mealPortionTimeStamps.iterator();
                while(iterator.hasNext()) {
                    iterator.next();
                    iterator.remove();
                    TOTAL_WASTE_COST += meal.getKey().getCost();
                }
            }
        }
    }

    private void discardOldMealsAndResetBuffet(int cycle) {
        for (Map.Entry<MealType, List<LocalDateTime>> meal : buffetSupply.entrySet()) {
            //TODO: magic number, evt. dependency injection
            if ((cycle >= 3) && meal.getKey().getDurability() == MealDurability.SHORT) {
                List<LocalDateTime> mealPortionTimeStamps = buffetSupply.get(meal.getKey());
                Iterator<LocalDateTime> iterator = mealPortionTimeStamps.iterator();
                while(iterator.hasNext()) {
                    iterator.next();
                    iterator.remove();
                    TOTAL_WASTE_COST += meal.getKey().getCost();
                }

            } else if (meal.getKey().getDurability() == MealDurability.LONG) {
                meal.setValue(fillFoodWithMaxMealPortions());
            }
        }
        System.out.println();
    }



    public List<LocalDateTime> fillFoodWithMaxMealPortions(){
        LocalDateTime timestamp = LocalDateTime.now();
        List<LocalDateTime> portions = new ArrayList<>();
        for (int i = 0; i < MAX_MEAL_PORTIONS; i++){
            portions.add(timestamp);
        }
        return portions;
    }


    public void fillBreakfastMap(){
        buffetSupply.put(MealType.SCRAMBLED_EGGS, fillFoodWithMaxMealPortions());
        buffetSupply.put(MealType.SUNNY_SIDE_UP, fillFoodWithMaxMealPortions());
        buffetSupply.put(MealType.FRIED_SAUSAGE, fillFoodWithMaxMealPortions());
        buffetSupply.put(MealType.FRIED_BACON, fillFoodWithMaxMealPortions());
        buffetSupply.put(MealType.PANCAKE, fillFoodWithMaxMealPortions());
        buffetSupply.put(MealType.CROISSANT, fillFoodWithMaxMealPortions());
        buffetSupply.put(MealType.MASHED_POTATO, fillFoodWithMaxMealPortions());
        buffetSupply.put(MealType.MUFFIN, fillFoodWithMaxMealPortions());
        buffetSupply.put(MealType.BUN, fillFoodWithMaxMealPortions());
        buffetSupply.put(MealType.CEREAL, fillFoodWithMaxMealPortions());
        buffetSupply.put(MealType.MILK, fillFoodWithMaxMealPortions());
    }

    public void printBreakfastBuffet(){
        for (Map.Entry<MealType, List<LocalDateTime>> meal : buffetSupply.entrySet()){
            System.out.print(meal.getKey() + " : ");
            try {
                System.out.println(meal.getValue().size());
            } catch (Exception e){
                System.out.println("0");
            }
        }
    }
}
