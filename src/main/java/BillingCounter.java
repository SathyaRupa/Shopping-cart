package com;

import java.util.List;

public class BillingCounter {

    private List<String,String> shoppingCart = shop.shoppingCart<>();

    public void calculateBillAmount() {
        shoppingCart.forEach((name, quantity) -> {
            double quantityRequired = parseQuantity(quantity);
            double price = listOfItems.get(name);
            billAmount += price * quantityRequired;
        });
    }

    private double parseQuantity(String quantity) {
        String[] parts = quantity.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        double value = Double.parseDouble(parts[0]);
        String unit = parts[1];

        if ("kg".equals(unit)) {
            return value;
        }
        return value / 1000;
    }
}
