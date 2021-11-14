import converter.InputStreamConverter;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HTTPRequest {
    private HttpURLConnection http;
    private InputStream inputStream;

    public InputStream get() {
        try {
            URL url = new URL("http://localhost:8080/music");
            http = (HttpURLConnection) url.openConnection();
            http.setRequestMethod("GET");
            InputStream inputStream = http.getInputStream();
            return inputStream;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public String getMessage() {
        try {
            URL url = new URL("http://localhost:8080/message");
            http = (HttpURLConnection) url.openConnection();
            http.setRequestMethod("GET");
            inputStream = http.getInputStream();

            String response = InputStreamConverter.convertToString(http.getInputStream());

            http.disconnect(); // 연결 해제
            return response;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
