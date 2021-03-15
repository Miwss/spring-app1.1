package ua.artemiy.springcourse;


import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("ua.artemiy.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpingConfig {
    private List<Object> list = new ArrayList<>();
    {
        list.add(new ClassicalMusic());
        list.add(new RapMusic());
        list.add(new RockMusic());
    }
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public  RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(classicalMusic(),rockMusic(),rapMusic());
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
