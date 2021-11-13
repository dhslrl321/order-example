import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpRequest;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        MusicByPlayer player = new MusicByPlayer(true);

        // clip.play();
        HTTPRequest request = new HTTPRequest();

        InputStream response = request.get();

        // MusicByClip clip = new MusicByClip(response);
        // clip.play();

        InputStream string = request.getString();
    }
}
