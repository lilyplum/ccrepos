package com.codecool.burgeroptimisation;

import com.codecool.burgeroptimisation.service.cooking.CookProvider;
import com.codecool.burgeroptimisation.service.cooking.CookingService;
import com.codecool.burgeroptimisation.service.menu.MenuService;
import com.codecool.burgeroptimisation.service.menu.MenuServiceImpl;
import com.codecool.burgeroptimisation.service.orders.OrderService;
import com.codecool.burgeroptimisation.ui.BurgerOptimisationUi;

public class Application {

    public static void main(String[] args) {
        CookProvider cookProvider = null;
        MenuService menuService = new MenuServiceImpl();
        CookingService cookingService = null;
        OrderService orderService = null;

        BurgerOptimisationUi ui = new BurgerOptimisationUi(menuService, orderService, cookProvider);
        ui.run();
    }

}
