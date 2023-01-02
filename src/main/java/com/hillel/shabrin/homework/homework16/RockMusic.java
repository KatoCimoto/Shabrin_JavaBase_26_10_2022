package com.hillel.shabrin.homework.homework16;

public class RockMusic extends MusicStyles {

    public RockMusic (String name){
        this.name = name;
    }

    @Override
   public void playMusic(){
        System.out.println(name + " is playing!");
    }
}
