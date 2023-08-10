package org.example.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private LoungeMusic loungeMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, LoungeMusic loungeMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.loungeMusic = loungeMusic;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();

        int rand = random.nextInt(3);

        if(genre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(rand));
        }
        if (genre == MusicGenre.ROCK) {
            System.out.println(rockMusic.getSongs().get(rand));
        }
        if (genre == MusicGenre.LOUNGE) {
            System.out.println(loungeMusic.getSongs().get(rand));
        }
    }

}
