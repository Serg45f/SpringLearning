package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);


        musicPlayer.setVolume(20);
        musicPlayer.playMusicList();
        System.out.println("~~~~~~");
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        System.out.println("~~~~~~");
        System.out.println(musicPlayer == musicPlayer1);
        System.out.println(musicPlayer);
        System.out.println(musicPlayer1);
        System.out.println("~~~~~~");
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer1.getVolume());


        context.close();
    }
}
