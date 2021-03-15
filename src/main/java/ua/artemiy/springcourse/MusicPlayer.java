package ua.artemiy.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
    private List<Music> musicList;

//    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;
   // private List<Music> musicList = new ArrayList<>();


    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }

//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }


    //public void setMusic(List<Music> musicList) {
//        this.musicList = musicList;
//    }

    public String playMusic(){
     Random random = new Random();

     return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSongs()
     + "  with volume " + this.volume;

    }
}
