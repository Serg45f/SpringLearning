package org.example.springcourse.genres;

import org.example.springcourse.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic  implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
