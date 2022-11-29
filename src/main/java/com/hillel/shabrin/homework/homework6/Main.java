package com.hillel.shabrin.homework.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first team name:");
        String firstTeam = scanner.nextLine();
        System.out.println("Enter first player score:");
        int wolf1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter second player score:");
        int wolf2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter third player score:");
        int wolf3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter fourth player score:");
        int wolf4 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter fifth player score:");
        int wolf5 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter second team name:");
        String secondTeam = scanner.nextLine();
        System.out.println("Enter first player score:");
        int dog1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter second player score:");
        int dog2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter third player score:");
        int dog3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter fourth player score:");
        int dog4 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter fifth player score:");
        int dog5 = scanner.nextInt();
        scanner.nextLine();

        int numbPlayers = 5;
        double countWTeam = ((double) wolf1 + wolf2 + wolf3 + wolf4 + wolf5) / numbPlayers;
        double countDTeam = ((double) dog1 + dog2 + dog3 + dog4 + dog5) / numbPlayers;
        if (countWTeam > countDTeam){
            System.out.println("Team " + firstTeam + " won! Score is " + countWTeam + ". Congratulations!");
        } else if (countWTeam < countDTeam) {
            System.out.println("Team " + secondTeam + " won! Score is " + countDTeam + ". Congratulations!");
        } else {
            System.out.println("Both Teams have the same number of points: " + countWTeam + ". Draw!");
        }

    }
}
