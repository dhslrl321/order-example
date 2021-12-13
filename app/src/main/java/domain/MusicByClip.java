package domain;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.InputStream;

public class MusicByClip {
    private Clip clip;
    private Long clipTime;

    public void switchMusic(Music music) {
        try {
            File file = new File(music.getMusicPath());
            AudioInputStream ais = AudioSystem.getAudioInputStream(file);

            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void play() {
        clip.setFramePosition(0);
        clip.start();
    }

    public void loop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop() {
        clip.stop();
    }
}
