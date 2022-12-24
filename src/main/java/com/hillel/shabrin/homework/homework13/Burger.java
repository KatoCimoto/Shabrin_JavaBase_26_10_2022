package com.hillel.shabrin.homework.homework13;

public class Burger {

    String bun;
    String meat;
    String plusMeat;
    String cheese;
    String mayonnaise;

    public Burger(String bun, String meat, String plusMeat, String cheese, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.plusMeat = plusMeat;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;

        System.out.println("You ordered a double meat burger, which includes: " + bun + ", "
                + meat + ", one more meat, " + cheese + ", " + mayonnaise + '.');
    }

    public Burger(String bun, String meat, String cheese, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;

        System.out.println("You ordered a classic burger, which includes: " + bun + ", "
                + meat + ", " + cheese + ", " + mayonnaise + '.');
    }

    public Burger(String bun, String meat, String cheese) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;

        System.out.println("You ordered a diet burger, which includes: " + bun + ", "
                + meat + ", " + cheese + '.');
    }
}

