import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class FileConverter {

    public static File convertInputStreamToFile(InputStream in) {
        // File temp = File.createTempFile(String.valueOf(in.hashCode()), ".tmp");
        return null;
    }

    private static InputStream get() throws Exception {
        URL url = new URL("http://localhost:8080/test");
        HttpURLConnection http = (HttpURLConnection) url.openConnection();

        http.setRequestMethod("GET");
        int responseCode = http.getResponseCode();

        return http.getInputStream();
    }
}
