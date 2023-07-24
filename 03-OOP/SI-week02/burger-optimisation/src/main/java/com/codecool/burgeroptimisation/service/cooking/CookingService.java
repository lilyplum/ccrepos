package com.codecool.burgeroptimisation.service.cooking;

import com.codecool.burgeroptimisation.model.Cook;
import com.codecool.burgeroptimisation.model.Meal;
import com.codecool.burgeroptimisation.model.Order;

import java.util.List;
import java.util.Queue;

public interface CookingService {

    Queue<Meal> cookOrders(Queue<Order> orders, List<Cook> cooks);
}
