package com.codecool.burgeroptimisation.service.menu;

import com.codecool.burgeroptimisation.model.Burger;
import com.codecool.burgeroptimisation.model.Cook;

import java.util.List;

public interface MenuService {
    List<Burger> getAvailableBurgers(List<Cook> cooks);
}
