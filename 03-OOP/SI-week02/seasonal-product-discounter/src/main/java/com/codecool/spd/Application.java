package com.codecool.spd;

import com.codecool.spd.data.Color;
import com.codecool.spd.data.Product;
import com.codecool.spd.data.Season;
import com.codecool.spd.logic.discount.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        // Initialize data and service classes
        Set<MonthlyDiscount> discounts = getDiscounts();
        List<Product> products = getProducts();

        // Initialize Screen and Input classes that will serve as the main UI

        // Use Screen and Input to get the user's choice.
        Product productToPurchase = products.get(0);
        LocalDate dateOfPurchase = LocalDate.parse("2022-09-17");

        // Calculate the offer via DiscounterService, based on the applicable discounts on the user's choice.

        // Display the offer
    }

    private static List<Product> getProducts() {
        return List.of(
                new Product("Yellow skirt", Color.YELLOW, Season.SPRING, 15.00),
                new Product("Blue skirt", Color.BLUE, Season.SPRING, 15.00),
                new Product("Red T-Shirt", Color.RED, Season.SUMMER, 10.00),
                new Product("Brown T-Shirt", Color.BROWN, Season.SUMMER, 10.00),
                new Product("Brown jacket", Color.BROWN, Season.AUTUMN, 40.00),
                new Product("Violet shirt", Color.VIOLET, Season.AUTUMN, 30.00),
                new Product("Blue jacket", Color.BLUE, Season.AUTUMN, 40.00),
                new Product("Blue hat", Color.BLUE, Season.WINTER, 10.00),
                new Product("Red gloves", Color.RED, Season.WINTER, 8.00),
                new Product("Yellow gloves", Color.YELLOW, Season.WINTER, 8.00)
        );
    }

    private static Set<MonthlyDiscount> getDiscounts() {
        return Set.of(
                new MonthlyDiscount("Summer Kick-off", 10, Set.of(Month.JUNE, Month.JULY)),
                new MonthlyDiscount("Winter Sale", 10, Set.of(Month.FEBRUARY))
        );
    }

}
