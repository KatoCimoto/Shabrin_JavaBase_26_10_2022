package com.hillel.shabrin.homework.homework15;

public class Iphone implements Smartphones, IOS{

    @Override
    public void startIOS() {
        System.out.println("Iphone start IOS system.." + "\n"
        + "3.." + "\n"
        + "2.." + "\n"
        + "1.." + "\n"
        + "WELCOME!" + "\n");
    }


    @Override
    public void call() {
        System.out.println("Iphone start call..");
    }

    @Override
    public void sms() {
        System.out.println("Iphone start sms..");
    }

    @Override
    public void internet() {
        System.out.println("Iphone start internet..");
    }

    @Override
    public void shutdownIOS() {
        System.out.println("Iphone shutdown IOS system. See you soon!");
    }
}
