package org.example.springcourse.config;

import org.example.springcourse.Computer;
import org.example.springcourse.Music;
import org.example.springcourse.MusicPlayer;
import org.example.springcourse.genres.ClassicalMusic;
import org.example.springcourse.genres.LoungeMusic;
import org.example.springcourse.genres.RockMusic;
import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("org.example.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public LoungeMusic jazzMusic() {
        return new LoungeMusic();
    }

    @Bean
    public List<Music> musicList() {
        // Этот лист неизменяемый (immutable)
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

}
