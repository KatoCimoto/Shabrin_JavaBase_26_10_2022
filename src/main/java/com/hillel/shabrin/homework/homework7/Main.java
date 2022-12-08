package com.hillel.shabrin.homework.homework7;

import java.util.Scanner;

// Guess the Number
public class Main {
    public static void main(String[] args) {
        System.out.println("You need to guess a number from 0 to 10. Enter your number:");

        int min = 0;
        int max = 10;
        int random = (int) (Math.random() * (max-min));

        Scanner scanner = new Scanner(System.in);

        int number;
        int attempts = 5;
        int i = 0;

        for (; i < attempts; i++) {
            if (scanner.hasNextInt()){
                number = scanner.nextInt();
            } else {
                System.out.println("Wrong data! Try again.");
                scanner.nextLine();
                continue;
            }
            if (number == random){
                System.out.println("Your answer is " + number + ". Correct! Congratulations!!");
                break;
            } else if (number < random && i != attempts -1){
                System.out.println("Your answer is " + number
                       + ". But the correct number is greater. Try again!");
            } else if (number > random && i != attempts -1){
                System.out.println("Your answer is " + number
                       + ". But the correct number is smaller. Try again!");
            } scanner.nextLine();
        } if (i == attempts){
            System.out.println("You've exhausted your attempts. The answer was: " + random);
        }
    }
}
