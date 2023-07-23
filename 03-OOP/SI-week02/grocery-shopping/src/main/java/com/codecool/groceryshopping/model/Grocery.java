package com.codecool.groceryshopping.model;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public record Grocery(String name, List<Product> products) {
    public static Grocery createCornerShop() {
        List<Product> cornerShopProducts = List.of(
                new Product("You can bake it! flour", 100, Set.of(Category.VITAL_FOOD)),
                new Product("Creamy Way fat milk", 100, Set.of(Category.DAIRY)),
                new Product("Greenade avocado", 200, Set.of(Category.VEGETABLE)),
                new Product("Sunset pineapple", 250, Set.of(Category.FRUIT, Category.BIG_CARBON_FOOTPRINT)),
                new Product("Porky Pork sausage", 300, Set.of(Category.VITAL_FOOD)),
                new Product("Pampas T-bone steak", 1500, Set.of(Category.MEAT, Category.BIG_CARBON_FOOTPRINT)),
                new Product("White Noise rice crackers", 100, Set.of(Category.SNACK)),
                new Product("Petito chips", 200, Set.of(Category.SNACK)),
                new Product("Gnutella monster box", 300, Set.of(Category.DAIRY, Category.UNHEALTHY)),
                new Product("Silencer Gin", 800, Set.of(Category.UNHEALTHY, Category.ALCOHOL))
        );
        return new Grocery("Corner Shop", cornerShopProducts);
    }
    public Product getProductByOrdinal(int ordinal) {
        return products.get(ordinal);
    }
}
