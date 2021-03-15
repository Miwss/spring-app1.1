package ua.artemiy.springcourse;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class RapMusic implements Music{

    @Override
    public String getSongs() {
        return "Rap Music";
    }
}
