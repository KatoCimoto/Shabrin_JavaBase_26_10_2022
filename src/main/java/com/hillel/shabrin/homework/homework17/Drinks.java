package com.hillel.shabrin.homework.homework17;

public class Drinks {

    private final DrinksMachine drinkName;
    private double price;
    private static double sum;

    public Drinks(DrinksMachine drinkName){

        double priceTEA = 10;
        double priceCOFFEE = 20;
        double priceLEMONADE = 15;
        double priceMINERAL = 5;
        double priceMOJITO = 25;
        double priceCOKE = 23;

        switch (drinkName) {
            case COFFEE -> price = priceCOFFEE;
            case TEA -> price = priceTEA;
            case LEMONADE -> price = priceLEMONADE;
            case MOJITO -> price = priceMOJITO;
            case MINERAL -> price = priceMINERAL;
            case COKE -> price = priceCOKE;
        }

        this.drinkName = drinkName;
        sum += price;
    }

    public DrinksMachine getDrinkName(){
        return drinkName;
    }

    public double getPrice(){
        return price;
    }

    public static double getSum(){
        return sum;
    }
}
