package com.hillel.shabrin.homework.homework17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        Drinks[] orders = new Drinks[15];

        Scanner scanner = new Scanner(System.in);


        while (true){

            System.out.println("\n" + "Please choose one of the drinks!");
            System.out.println("After all drinks have been prepared, enter EXIT to finish.");
            System.out.println(Arrays.toString(DrinksMachine.values()));

            String usersDrink = scanner.nextLine().toUpperCase();
            DrinksMachine newDrink = null;

            for (DrinksMachine eDrink : DrinksMachine.values()) {

                if(eDrink.toString().equals(usersDrink)) {

                    newDrink = DrinksMachine.valueOf(usersDrink);

                    orders[i] = new Drinks(newDrink);
                    ++i;

                    newDrink.cooking();
                    break;
                }
            }

            if(usersDrink.equals("EXIT")){
                System.out.println("Your order:");

                for(Drinks drinks : orders) {
                    if(drinks != null) {
                        System.out.println(drinks.getDrinkName() + " = " + drinks.getPrice() + " UAH");
                    } else break;
                }

                System.out.println( "\n" + "Thank you for your order! Total amount: " + Drinks.getSum() + " UAH");
                break;
            }

            if(newDrink == null){
                System.out.println("\n" + "Wrong data! Please try again.");
            }
        }
    }
}