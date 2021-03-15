package ua.artemiy.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    List<String> songs = new ArrayList<>();
    {
        songs.add("Queen");
        songs.add("Rock1");
        songs.add("Rock2");
    }


    @Override
    public String getSongs() {
        return "Rock Music";
    }
}
