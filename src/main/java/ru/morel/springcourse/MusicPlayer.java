package ru.morel.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music2,
                       @Qualifier("classicalMusic") Music music1) {
        this.music1 = music1;
        this.music2 = music2;
    }
    //    public MusicPlayer(Music music) {
//        this.music = music;
//    }

//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public String playMusic(MusicStyle musicStyle) {
        switch (musicStyle) {
            case CLASSICAL:
                return "Playing: " + music1.getSong().
                        get(new Random().nextInt(music1.getSong().size()));
            case ROCK:
                return "Playing: " + music2.getSong().
                        get(new Random().nextInt(music2.getSong().size()));
        }
        return "Nothing to play";
    }
}
