package com.hillel.shabrin.homework.homework18;

public class Main {

    public static double getAverageValue(int[] array) {

        double sum = 0;

        if (array == null){
            return 0.0;
        }

        for (double value : array){
            sum += value;


        } return sum;
    }

    public static boolean isSquare(int[][] array ){

        double value = 0;

        if (array == null || array.length == 0) {
            return false;
        }

        for (int [] num : array) {
            if (num == null || num.length == 0) {
                return false;
            }
            value += num.length;
        }

        value = value / (double) array.length;
        return value == array.length;
    }
}
