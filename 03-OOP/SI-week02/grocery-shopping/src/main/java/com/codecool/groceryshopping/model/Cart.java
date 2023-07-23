package com.codecool.groceryshopping.model;

import java.util.Map;

public record Cart(Map<Product, Integer> products) {

}
