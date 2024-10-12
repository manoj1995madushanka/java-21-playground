package com.example.java21playground.unnamed_patterns;

import java.util.List;

public class UnnamedPatterns {

    public void unnamedPattern(){
        var house = new House("abc",3,true);
        printNumberOfBedrooms(house);
    }

    public void example2(){
        List<String> items = List.of("1","2","3");
        var basketTotal =0;
        for (String _: items){
            basketTotal++;
        }
        System.out.println("Basket total: "+basketTotal);

        var lastItem = items.getLast();
        try{
            int i = Integer.parseInt(lastItem);
            System.out.println("Last Item : "+ lastItem);
        }catch (NumberFormatException _){
            System.out.println("Bad number: "+ lastItem);
        }
    }

    private void printNumberOfBedrooms(Building building) {
        // we can add _ to not used parameters
        if (building instanceof  House(_, var numberOfBedrooms, _)){
            System.out.println("Number of bedrooms : "+numberOfBedrooms);
        }
    }
}
