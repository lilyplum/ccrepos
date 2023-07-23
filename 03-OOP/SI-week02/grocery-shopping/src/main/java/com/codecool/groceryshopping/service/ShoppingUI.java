package com.codecool.groceryshopping.service;

import com.codecool.groceryshopping.model.Grocery;
import com.codecool.groceryshopping.model.Product;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingUI {

    private static final String BUY_COMMAND = "buy";
    private static final String LIST_COMMAND = "list";
    private final BufferedReader br;
    private final Map<Product, Integer> cart = new HashMap<>();

    public ShoppingUI(BufferedReader br) {
        this.br = br;
    }

    /**
     * Use `br.readLine().strip();` to read a "line" from the console input
     *
     * Prompt text: "Put an item in your cart or type 'buy' to see the check: "
     * Error text: "You've tried to add an invalid product, please try again! Type 'list' to see your options."
     */

    public void run() {
        displayCart();
        String command;
        do {
            System.out.print("Put an item in your cart or type 'buy' to see the check: ");
            try {
                command = br.readLine().strip();
            } catch (IOException e) {
                System.err.println("Error reading input: " + e.getMessage());
                return;
            }
            switch (command) {
                case LIST_COMMAND:
                    displayProducts();
                    break;
                case BUY_COMMAND:
                    displayCart();
                    System.out.println("Good-bye!");
                    break;
                default:
                    try {
                        int productIndex = Integer.parseInt(command);
                        if (productIndex > 0 && productIndex <= Grocery.createCornerShop().products().size()) {
                            Product product = Grocery.createCornerShop().products().get(productIndex - 1);
                            addToCart(product);
                        } else {
                            System.out.println("Invalid product number, please try again!");
                            displayCart();
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid command, please try again!");
                        displayCart();
                    }
            }
        } while (!BUY_COMMAND.equalsIgnoreCase(command));
    }

    private void displayProducts() {
        System.out.println("Available products:");
        List<Product> products = Grocery.createCornerShop().products();
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println((i + 1) + ". " + product.name() + " - " + product.netPrice() + " cents");
        }
        System.out.println();
        displayCart();
    }

    private void addToCart(Product product) {
        int quantity = cart.getOrDefault(product, 0);
        cart.put(product, quantity + 1);
        System.out.println("Added 1 " + product.name() + " to your cart.");
        displayCart();
    }

    private void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Your cart:");
            System.out.printf("%-30s %-10s %-10s %-10s\n", "product", "quantity", "net unit", "net total");
            System.out.println("-".repeat(60));
            int totalPrice = 0;
            for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
                Product product = entry.getKey();
                int quantity = entry.getValue();
                int netPrice = product.netPrice();
                int netTotal = quantity * netPrice;
                System.out.printf("%-30s %-10d %-10d %-10d\n", product.name(), quantity, netPrice, netTotal);
                totalPrice += netTotal;
            }
            System.out.println("-".repeat(60));
            System.out.printf("Total price: %d coins\n\n", totalPrice);
        }
    }

/**
 * Pretty printed cart example
 *
 * Your cart
 *           product           :  quantity  :  net unit  : net total  :  tax rate  : tax total  : gross total
 * ----------------------------------------------------------------------------------------------------------
 * "Pampas" T-bone steak       :    6  pcs  : 1500 coins : 9000 coins :     18%    : 1620 coins : 10620 coins
 * "Gnutella" monster box      :    1  pcs  :  300 coins :  300 coins :     25%    :
}**/

}