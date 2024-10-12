package com.example.java21playground.record_pattern;

import static java.lang.StringTemplate.STR;

public class RecordPatternFeat {

    public void recordPatternFeat() {
        var product1 = new FoodItem("Apple", 0.99);
        var product2 = new DrinkItem("Water", 1.29);

        printDetails(product1);
        printDetails(product2);
    }

    private void printDetails(Item item) {
        // before java 21
        if (item instanceof FoodItem) {
            var foodItem = (FoodItem) item;
            System.out.println(STR."Food with item name \{foodItem.name()} has price \{foodItem.price()}");
        } else if (item instanceof DrinkItem) {
            var drinkItem = (DrinkItem) item;
            System.out.println(STR."Drink with item name \{drinkItem.name()} has price \{drinkItem.price()}");
        }

        // with java 21
        if (item instanceof FoodItem(var name, var price)) {
            System.out.println(STR."Food with item name \{name} has price \{price}");
        } else if (item instanceof DrinkItem(var name, var price)) {
            System.out.println(STR."Drink with item name \{name} has price \{price}");
        }

        // use switch statement pattern matching
        switch (item) {
            case FoodItem foodItem -> {
                System.out.println(STR."Food with item name \{foodItem.name()} has price \{foodItem.price()}");
            }
            case DrinkItem drinkItem -> {
                System.out.println(STR."Drink with item name \{drinkItem.name()} has price \{drinkItem.price()}");
            }
            default -> {
                throw new IllegalArgumentException("Type not found");
            }
        }

    }
}
