package com.codecool.burgeroptimisation.ui;

import com.codecool.burgeroptimisation.model.Burger;
import com.codecool.burgeroptimisation.model.Cook;
import com.codecool.burgeroptimisation.model.Meal;
import com.codecool.burgeroptimisation.service.cooking.CookProvider;
import com.codecool.burgeroptimisation.service.menu.MenuService;
import com.codecool.burgeroptimisation.service.orders.OrderService;

import java.util.List;
import java.util.Queue;

public class BurgerOptimisationUi {
    private final MenuService menuService;
    private final OrderService orderService;
    private final CookProvider cookProvider;

    public BurgerOptimisationUi(
            MenuService menuService,
            OrderService orderService,
            CookProvider cookProvider) {
        this.menuService = menuService;
        this.orderService = orderService;
        this.cookProvider = cookProvider;
    }

    public void run() {
        List<Cook> cooks = cookProvider.getCooks();
        List<Burger> availableBurgers = menuService.getAvailableBurgers(cooks);

        displayAvailableBurgers(availableBurgers);

        List<Burger> burgers = getRandomOrders(availableBurgers);

        addOrdersToOrderService(burgers);
        Queue<Meal> meals = prepareOrders();
        displayMeals(meals);
    }

    private void displayAvailableBurgers(List<Burger> burgers) {
        System.out.println("Currently available burgers on the menu:");
        //your code goes here
    }

    private void addOrdersToOrderService(List<Burger> burgers) {
        //your code goes here
    }

    private void displayMeals(Queue<Meal> meals) {
        System.out.println("Meals prepared!");
        //your code goes here
    }

    private List<Burger> getRandomOrders(List<Burger> availableBurgers) {
        //randomly order some burgers
        return List.of(
                availableBurgers.get(1),
                availableBurgers.get(1),
                availableBurgers.get(2),
                availableBurgers.get(2),
                availableBurgers.get(1),
                availableBurgers.get(0),
                availableBurgers.get(0));
    }

    private Queue<Meal> prepareOrders() {
        return orderService.processOrders();
    }


}
