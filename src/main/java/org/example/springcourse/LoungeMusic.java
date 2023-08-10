package org.example.springcourse;

import org.springframework.stereotype.Component;

@Component
public class LoungeMusic implements Music{
    @Override
    public String getSong() {
        return "Bla Bla Bla";
    }
}
