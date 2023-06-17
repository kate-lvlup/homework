package org.example;

public class MusicPlayer {
    private Music music;

    //IoC - here we inject the dependency
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}
