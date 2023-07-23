package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
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

        Music classicalMusic = context.getBean("musicClassic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
    }
}
