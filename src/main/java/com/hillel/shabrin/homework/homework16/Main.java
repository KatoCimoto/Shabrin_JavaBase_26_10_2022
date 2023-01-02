package com.hillel.shabrin.homework.homework16;

// Polymorphism

public class Main {
    public static void main(String[] args) {

        MusicStyles[] musicStyles = {
                new PopMusic("Billie Eilish"),
                new RockMusic("AC/DC"),
                new ClassicMusic("Beethoven")
};

        for (MusicStyles group : musicStyles){
            group.playMusic();
        }
    }
}
