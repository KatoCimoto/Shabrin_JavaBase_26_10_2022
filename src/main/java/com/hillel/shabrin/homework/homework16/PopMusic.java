package com.hillel.shabrin.homework.homework16;


public class PopMusic extends MusicStyles {

    public PopMusic (String name){
        this.name = name;
    }

    @Override
   public void playMusic(){
        System.out.println(name + " is playing!");
    }
}
