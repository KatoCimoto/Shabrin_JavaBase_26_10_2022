package com.hillel.shabrin.homework.homework10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int min = 0;
        int max = 10;

        int[] first = new int [7];
        int[] second = new int [7];

        for (int i = 0; i < first.length; i++) {
            first[i] = ((int) (Math.random() * max) - min);
            second[i] = ((int) (Math.random() * max) - min);
        }
        Arrays.sort(first);
        Arrays.sort(second);

        System.out.println("First array: " + Arrays.toString(first));
        System.out.println("Second array: " + Arrays.toString(second));

        int counter = 0;
        int index;
        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                counter++;
                index = i;
                System.out.println("Match in element: " + index);
            }
        } System.out.println("Number of coincidences: " + counter);
    }
}