package com.hillel.shabrin.homework.homework17;

public enum DrinksMachine {

    COFFEE("Americano", "milk"),
    TEA("Tea", "lemon"),
    LEMONADE("Lemonade", "carambola"),
    MOJITO("Mojito", "alcohol"),
    MINERAL("Mineral water","lemon"),
    COKE("Coca-Cola","lime");

    private final String name;
    private final String ingredient;

    DrinksMachine (String name, String ingredient){
        this.name = name;
        this.ingredient = ingredient;
    }

     void cooking(){
        System.out.println("Your drink " + name + " cooking with " + ingredient + "\n"
                + "Please, wait a few seconds.." + "\n"
                + "Done! Take tour drink!");
    }
}
