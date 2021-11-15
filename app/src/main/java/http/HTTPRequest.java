package http;

import converter.InputStreamConverter;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HTTPRequest {
    private static HttpURLConnection http;
    private static InputStream inputStream;

    /**
     * 음악 Stream 데이터를 요청한다.
     *
     * @param musicId : 요청할 Music 의 id
     * @return 음악 데이터의 InputStream
     */
    public File fetchMusicStream(Long musicId) {
        InputStream fetch = sendRequest("/musics/" + musicId, "GET");
        return InputStreamConverter.convertToFile(fetch);
    }

    public String getMessage() {
        InputStream fetch = sendRequest("/message", "GET");
        return InputStreamConverter.convertToString(fetch);
    }

    /**
     * http 요청을 서버로 보내고 Response 에 대한 InputStream 을 반환한다.
     *
     * @param spec : 요청 url
     * @param method : HTTP Request Method
     * @return response InputStream
     */
    private static InputStream sendRequest(String spec, String method) {
        try {
            URL url = new URL("http://localhost:8080/api" + spec);
            http = (HttpURLConnection) url.openConnection();
            http.setRequestMethod(method);
            InputStream inputStream = http.getInputStream();
            return inputStream;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
