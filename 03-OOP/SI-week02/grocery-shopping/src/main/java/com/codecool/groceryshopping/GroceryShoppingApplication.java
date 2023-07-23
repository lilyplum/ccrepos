package com.codecool.groceryshopping;

import com.codecool.groceryshopping.model.Category;
import com.codecool.groceryshopping.model.Grocery;
import com.codecool.groceryshopping.model.Product;
import com.codecool.groceryshopping.service.ShoppingUI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GroceryShoppingApplication {

    public static void main(String[] args) {
        ShoppingUI shoppingUI = new ShoppingUI(new BufferedReader(new InputStreamReader(System.in)));
        shoppingUI.run();
    }
}
