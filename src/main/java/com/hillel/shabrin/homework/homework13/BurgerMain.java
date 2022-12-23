package com.hillel.shabrin.homework.homework13;

public class BurgerMain {
    public static void main(String[] args) {

        Burger classic = new Burger("bun", "meat", "cheese", "mayonnaise");
        Burger doubleM = new Burger("bun", "meat", "+meat", "cheese", "mayonnaise");
        Burger diet = new Burger("bun", "meat", "cheese");

        classic.classic();
        doubleM.doubleMeat();
        diet.diet();
    }
}
