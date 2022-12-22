package com.hillel.shabrin.homework.homework12;

public class Main {
    public static void main(String[] args) {

        Person first = new Person();
       first.personInfo("Will Smith", "New York", "2936729462846");

       Person second = new Person();
        second.personInfo("Jackie Chan", "Shanghai", "12312412412");

        Person third = new Person();
       third.personInfo("Sherlock Holmes", "London", "37742123513");

    }
}

class Person {
    public void personInfo(String name, String city, String phone) {
        System.out.println("You can call " + name +
                " from " + city + " using this number: " + phone + '.');
    }
}