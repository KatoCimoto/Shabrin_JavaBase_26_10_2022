package com.hillel.shabrin.homework.homework16;

public class ClassicMusic extends MusicStyles {

    public ClassicMusic (String name){
        this.name = name;
    }

    @Override
   public void playMusic(){
        System.out.println(name + " is playing!");
    }
}
