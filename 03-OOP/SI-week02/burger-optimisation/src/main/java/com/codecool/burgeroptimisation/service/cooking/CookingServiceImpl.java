package com.codecool.burgeroptimisation.service.cooking;

import com.codecool.burgeroptimisation.model.Cook;
import com.codecool.burgeroptimisation.model.Meal;
import com.codecool.burgeroptimisation.model.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CookingServiceImpl implements CookingService {
    private final Map<Cook, Integer> workLoadMap = new HashMap<>();

    public Queue<Meal> cookOrders(Queue<Order> orders, List<Cook> cooks) {
        return null;
    }

    private void initializeWorkLoadMap(List<Cook> cooks) {
        for (Cook cook : cooks) {
            workLoadMap.put(cook, 0);
        }
    }

    private void addWorkLoad(Cook cook, int workLoad) {
        workLoadMap.put(cook, workLoadMap.get(cook) + workLoad);
    }

    private void resetWorkLoadMap() {
        workLoadMap.clear();
    }

}
