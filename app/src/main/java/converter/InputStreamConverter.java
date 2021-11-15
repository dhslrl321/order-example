package converter;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamConverter {

    private static final int BUFFER_SIZE = 4096;

    /**
     * InputStream 을 받아서 String 으로 반환한다.
     *
     * @param is : Response InputStream
     * @return 변환된 문자열
     */
    public static String convertToString(InputStream is) {

        ByteArrayOutputStream result = new ByteArrayOutputStream();

        try {
            byte[] buffer = new byte[BUFFER_SIZE];
            int length;
            while ((length = is.read(buffer)) != -1) {
                result.write(buffer, 0, length);
            }
            result.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result.toString(StandardCharsets.UTF_8);
    }

    /**
     * InputStream 을 받아서 File 으로 반환한다.
     *
     * @param is : Response InputStream
     * @return 변환된 File
     */
    public static File convertToFile(InputStream is) {
        File temp = null;
        try {
            temp = File.createTempFile(String.valueOf(is.hashCode()), ".wav");
            temp.deleteOnExit();

            FileOutputStream os = new FileOutputStream(temp);
            int bytesRead;

            byte[] buffer = new byte[BUFFER_SIZE];

            while((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }

            os.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return temp;
    }
}
