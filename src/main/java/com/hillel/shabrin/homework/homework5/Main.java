package com.hillel.shabrin.homework.homework5;
// ДЗ 5. Китайскі династії
public class Main {
    public static void main(String[] args) {
int liWarrior = 13;
int liArcher = 24;
int liRider = 46;
int liCount = 860;
int liPower = (liWarrior + liArcher + liRider) * liCount;

int minRider = 12;
int minWarrior = 9;
int minArcher = 35;
double whatMinPower = (liCount * 1.5);
int minCount = (int) whatMinPower;
int minPower = (minWarrior + minArcher + minRider) * minCount;

        System.out.println("Загальний показник сили династії Лі = " + liPower);
        System.out.println("Загальний показник сили династії Мінь = " + minPower);




    }
}
