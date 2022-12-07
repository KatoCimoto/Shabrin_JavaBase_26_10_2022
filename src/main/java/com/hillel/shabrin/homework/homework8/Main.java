package com.hillel.shabrin.homework.homework8;

// Shuttle numbers
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int numberShuttle = 0;
        while (count < 100) {
            String c = String.valueOf(++numberShuttle);
            if ((c.contains("4") || c.contains("9"))) {
                continue;
            }
            System.out.println("Number of Shuttle: " + numberShuttle);
            count++;
        }
        System.out.println("Total quantity: " + count);
    }
}
