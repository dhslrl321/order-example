import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpRequest;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        HTTPRequest request = new HTTPRequest();

        InputStream responseInputStream = request.get();

        File file = FileConverter.convertInputStreamToFile(responseInputStream);

        MusicByClip player = new MusicByClip(file);
        player.play();

        while(true);
    }
}
