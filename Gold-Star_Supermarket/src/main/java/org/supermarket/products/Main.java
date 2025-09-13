package org.supermarket.products;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<GroceryProduct> cart = new ArrayList<GroceryProduct>();

        GroceryProduct toast = new GroceryProduct("Toast", 2.5, 10);
        cart.add(toast);

        Beverage coke = new Beverage("Coke", 1.5, 0, SugarLevel.ZERO);
        cart.add(coke);

        DairyProduct milk = new DairyProduct("Milk", 4, 0, Fat.FULLCREAM);
        cart.add(milk);

        double total = 0;

        for (int i = 0; i < cart.size(); i++) {
            total += cart.get(i).getActualPrice();
        }

        System.out.print("The total cost = " + total);

        }
    }
