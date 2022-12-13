package com.hillel.shabrin.homework.homework9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int min = 18;
        int max = 41;

        int[] team1 = new int[25];
        int[] team2 = new int[25];

        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * (max - min) + min);
            team2[i] = (int) (Math.random() * (max - min) + min);
        }
        double avTeam1 = 0;
        double avTeam2 = 0;
        for (int i = 0; i < team1.length; i++) {
            avTeam1 += team1[i];
            avTeam2 += team2[i];
        }
        double average1 =  avTeam1 / team1.length;
        double average2 =  avTeam2 / team2.length;

        System.out.println("First team age: " + Arrays.toString(team1));
        System.out.println("Second team age: " + Arrays.toString(team2));

        System.out.println("First team average age: " + average1);
        System.out.println("Second team average age: " + average2);
    }
}
