package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //init & destroy
//        Music classicalMusic = context.getBean("musicClassic", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());
//
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer firstMusicPlayer = context.getBean("someMusicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("someMusicPlayer", MusicPlayer.class);
//
//        firstMusicPlayer.playMusic();
//        firstMusicPlayer.setName("Panasonic");
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getName());
//        System.out.println(firstMusicPlayer.getVolume());
//
//        System.out.println("----------------------------------------");
//
//        secondMusicPlayer.playMusic();
//        System.out.println(secondMusicPlayer.getName());
//        System.out.println(secondMusicPlayer.getVolume());
//        context.close();

        //factory method
//        Music classicalMusic = context.getBean("musicClassic", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());

//        Music someRockMusic= context.getBean("rockMusic", Music.class);
//        Music someClassicalMusic= context.getBean("classicalMusic", Music.class);

//        System.out.println(someRockMusic.getSong());
//        System.out.println(someClassicalMusic.getSong());

//        MusicPlayer somePlayerMusic= context.getBean("someMusicPlayer", MusicPlayer.class);
//        somePlayerMusic.setMusicList(List.of(someClassicalMusic, someRockMusic));
//        somePlayerMusic.playMusic();
//        context.close();


//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
