package ua.artemiy.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music{

    @PostConstruct
    public void init(){
        System.out.println("init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy method");
    }

  private List<String> songs = new ArrayList<>();
    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C minor, op 67");
        songs.add("Night on Bald Mountain");
    }

    @Override
    public String getSongs()
    {
        return "Classical Music";
    }
    //private ClassicalMusic(){}

//    public static ClassicalMusic getClassicalMusic(){
//        return new ClassicalMusic();
//    }

//    public void doMyInit(){
//        System.out.println("Doing my initialization");
//    }

//    public void doMyDestroy(){
//        System.out.println("Doing my destruction");
//    }

}
