package com.codecool.burgeroptimisation.service.menu;

import com.codecool.burgeroptimisation.model.Burger;
import com.codecool.burgeroptimisation.model.Cook;

import java.util.ArrayList;
import java.util.List;

public class MenuServiceImpl implements MenuService {
    private final List<Burger> allBurgers;

    public MenuServiceImpl() {
        allBurgers = generateAllBurgers();
    }

    @Override
    public List<Burger> getAvailableBurgers(List<Cook> cooks) {
        return null;
    }

    private List<Burger> generateAllBurgers() {
        List<Burger> allBurgers = new ArrayList<>();

        allBurgers.add(new Burger("All in burger", 6));

        allBurgers.add(new Burger("Vegan bean burger", 7));

        allBurgers.add(new Burger("Light beef burger", 5));

        allBurgers.add(new Burger("Cheeseburger", 4));

        allBurgers.add(new Burger("Double cheese burger", 9));

        allBurgers.add(new Burger("Meat lover burger", 8));

        allBurgers.add(new Burger("Chilli cheese angus burger", 10));

        allBurgers.add(new Burger("Impossible burger", 12));

        return allBurgers;
    }
}
