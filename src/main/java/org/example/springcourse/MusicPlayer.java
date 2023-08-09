package org.example.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer(){}

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

    public void playMusicList() {
        for(Music music1:musicList) {
            System.out.println("Playing: " + music1.getSong());
        }
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

}
