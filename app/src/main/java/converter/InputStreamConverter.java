package converter;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamConverter {
    public static String convertToString(InputStream is) {

        ByteArrayOutputStream result = new ByteArrayOutputStream();

        try {
            byte[] buffer = new byte[4096];
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

    public static File convertToFile(InputStream in) {
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
            System.out.println(e.getMessage());
        }

        return temp;
    }
}
