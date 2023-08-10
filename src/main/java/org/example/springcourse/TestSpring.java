package org.example.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

//        Music rockMusic = context.getBean("rockMusicBean", Music.class);
//
//        MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusic);
//
//        rockMusicPlayer.playMusic();
//
//        Music classicalMusic = context.getBean("classicalMusic", Music.class);
//
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(classicalMusic);
//
//        classicalMusicPlayer.playMusic();
//
//        Music loungeMusic = context.getBean("loungeMusic", Music.class);
//
//        MusicPlayer loungeMusicPlayer = new MusicPlayer(loungeMusic);
//
//        loungeMusicPlayer.playMusic();

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(MusicGenre.CLASSICAL);
        musicPlayer.playMusic(MusicGenre.ROCK);
        musicPlayer.playMusic(MusicGenre.LOUNGE);

        context.close();
    }
}
