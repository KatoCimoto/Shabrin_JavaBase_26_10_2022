package com.hillel.shabrin.homework.homework11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines;
        int column;

        System.out.println("Enter the first size: ");

        while (true){
            if (scanner.hasNextInt()){
                lines = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Wrong data! Try again.");
                scanner.nextLine();
            }

        }

        System.out.println("Enter the second size: ");

        while (true){
            if (scanner.hasNextInt()){
                column = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Wrong data! Try again.");
                scanner.nextLine();
            }

        }

        int[][] array = new int [lines][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array [i][j] = ((int)(Math.random() * 200) + 1);
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println();
        }

        System.out.println("\n" + "The new array:");

        int[][] updateArray = new int [lines][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                updateArray[j][i] = array[i][j];
            }
        }

        for (int[] line : updateArray){
            for (int call : line) {
                System.out.print(call + "\t\t");
            }
            System.out.println();
        }
    }
}
