package org.example.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LoungeMusic implements Music{
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("La La La");
        songs.add("Bu Bu Bu");
        songs.add("Yahoo");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
