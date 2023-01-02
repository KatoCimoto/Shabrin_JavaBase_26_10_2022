package com.hillel.shabrin.homework.homework15;
// Interfaces
public class Main {
    public static void main(String[] args) {

        Android xiaomi = new Android();
        Iphone iphone14 = new Iphone();

        xiaomi.startLinuxOS();
        xiaomi.sms();
        xiaomi.internet();
        xiaomi.call();
        System.out.println();
        xiaomi.shutdownLinuxOS();

        System.out.println();

        iphone14.startIOS();
        iphone14.sms();
        iphone14.internet();
        iphone14.call();
        System.out.println();
        iphone14.shutdownIOS();
    }
}
