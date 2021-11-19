import http.HTTPRequest;
import player.MusicByClip;
import presenter.MainDisplay;
import presenter.MainFrame;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        //new MainDisplay();
        new MainFrame();

        /*HTTPRequest request = new HTTPRequest();

        File file = request.fetchMusicStream(1L);

        MusicByClip player = new MusicByClip(file);

        player.play();

        while(true);*/
    }
}
