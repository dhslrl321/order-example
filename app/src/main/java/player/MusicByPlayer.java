package player;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MusicByPlayer extends Thread {

    private Player player;
    private boolean isLoop;
    private File file;
    private FileInputStream fis;
    private BufferedInputStream bis;

    public MusicByPlayer(boolean isLoop) {
        try {
            this.isLoop = isLoop;
            file = new File(System.getProperty("user.dir") + "/music/music1.mp3");
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            player = new Player(bis);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getTime() {
        if(player == null) {
            return 0;
        }

        return player.getPosition();
    }

    public void close() {
        isLoop = false;
        player.close();
        this.interrupt();
    }

    @Override
    public void run() {
        try {
            do {
                player.play();
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                player = new Player(bis);
            } while (isLoop);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
