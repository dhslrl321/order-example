import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.InputStream;

public class MusicByClip {
    private Clip clip;

    public MusicByClip() {
        try {
            File file = new File(System.getProperty("user.dir") + "/music/music3.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(file);

            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public MusicByClip(File file) {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " MusicByClip 생성자");
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
