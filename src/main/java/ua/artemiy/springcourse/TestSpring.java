package ua.artemiy.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
           SpingConfig.class
        );
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic(MusicGenre.CLASSICAL);
//        musicPlayer.playMusic(MusicGenre.ROCK);


//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer.playMusic();


//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//
//        Music music1 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer classicalMusic = new MusicPlayer(music1);
//        classicalMusic.playMusic();
//        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//
//        System.out.println(classicalMusic.getSong());




        //        Music test1 = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(test1);
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//        classicalMusic.getSongs();


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());


        context.close();
    }
}