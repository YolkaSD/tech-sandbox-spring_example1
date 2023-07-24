package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class MusicPlayer {
    private Music music;

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong() + " " + rockMusic.getSong();
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
    }


    @Override
    public String toString() {
        return "MusicPlayer{" +
                "name='" + name + '\'' +
                '}';
    }
}
