package com.hillel.shabrin.homework.homework12;

public class Person {
    public static void main(String[] args) {

        String person1 = personInfo("Will Smith", "New York", "2936729462846");
        System.out.println(person1);

        String person2 = personInfo("Jackie Chan", "Shanghai", "12312412412");
        System.out.println(person2);

        String person3 = personInfo("Sherlock Holmes", "London", "37742123513");
        System.out.println(person3);

    }

    static String personInfo(String fullName, String city, String phone) {
        String call = "You can call " + fullName +
                " from " + city + " using this number: " + phone + '.';

        return call;
    }
}
