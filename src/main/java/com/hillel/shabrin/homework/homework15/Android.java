package com.hillel.shabrin.homework.homework15;

public class Android implements Smartphones, LinusOS {

    @Override
    public void startLinuxOS() {
        System.out.println("""
                Android start LinuxOS system..
                3..
                2..
                1..
                0.5..
                WELCOME!
                """);
    }

    @Override
    public void call() {
        System.out.println("Android start call..");
    }

    @Override
    public void sms() {
        System.out.println("Android start sms..");
    }

    @Override
    public void internet() {
        System.out.println("Android start internet..");
    }

    @Override
    public void shutdownLinuxOS() {
        System.out.println("Android shutdown IOS system. See you soon!");
    }
}
