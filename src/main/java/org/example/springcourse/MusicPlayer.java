package org.example.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

//    private Music music;

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    private ClassicalMusic classicalMusic;
   @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }
    public MusicPlayer(){}

//    public void playMusic() {
//        System.out.println("Playing: " + music.getSong());
//    }
public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong());
    }
}
