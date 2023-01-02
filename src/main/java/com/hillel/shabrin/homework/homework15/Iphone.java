package com.hillel.shabrin.homework.homework15;

public class Iphone implements Smartphones, IOS{

    @Override
    public void startIOS() {
        System.out.println("""
                Iphone start IOS system..
                3..
                2..
                1..
                WELCOME!
                """);
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
