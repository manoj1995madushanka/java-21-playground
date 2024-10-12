package com.example.java21playground.record_pattern;

import static java.lang.StringTemplate.STR;

public class RecordPatternFeat {

    public void recordPatternFeat(){
        var product1 = new FoodItem("Apple",0.99);
        var product2 = new DrinkItem("Water",1.29);

        printDetails(product1);
        printDetails(product2);
    }

    private void printDetails(Item item) {
        // before java 21
        if (item instanceof FoodItem){
            var foodItem = (FoodItem) item;
            System.out.println(STR."Food with item name \{foodItem.name()} has price \{foodItem.price()}");
        } else if (item instanceof DrinkItem) {
            var drinkItem = (DrinkItem) item;
            System.out.println(STR."Food with item name \{drinkItem.name()} has price \{drinkItem.price()}");
        }

        // with java 21
        if (item instanceof FoodItem(var name, var price)){
            System.out.println(STR."Food with item name \{name} has price \{price}");
        } else if (item instanceof DrinkItem(var name, var price)) {
            System.out.println(STR."Food with item name \{name} has price \{price}");
        }
    }
}
