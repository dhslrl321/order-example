import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class FileConverter {

    public static File convertInputStreamToFile(InputStream in) {

        File temp = null;

        try {
            temp = File.createTempFile(String.valueOf(in.hashCode()), ".wav");

            temp.deleteOnExit();

            FileOutputStream os = new FileOutputStream(temp);

            int bytesRead;
            byte[] buffer = new byte[4096];

            while((bytesRead = in.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }

            os.close();
            in.close();
        } catch (Exception e) {

        }

        return temp;
    }

    private static InputStream get() throws Exception {
        URL url = new URL("http://localhost:8080/test");
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        int responseCode = http.getResponseCode();

        return http.getInputStream();
    }
}
