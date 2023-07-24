package com.codecool.burgeroptimisation.service.orders;

import com.codecool.burgeroptimisation.model.Burger;
import com.codecool.burgeroptimisation.model.Meal;

import java.util.Queue;

public interface OrderService {
    void addBurger(Burger burger);
    Queue<Meal> processOrders();
}
