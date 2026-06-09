package InputStreams_outputStreams.ByteStrams;

import java.io.FileOutputStream;
import java.io.IOException;

public class outputStreams {

    public static void main() {
        try (FileOutputStream fs = new FileOutputStream("C:\\Users\\abdul\\OneDrive\\Desktop\\Code\\java git\\InputStreams_outputStreams\\ByteStrams\\Firat.txt")){

            String text = "HI java ";
            byte[] data = text.getBytes();
            fs.write(data);

            System.out.println("Successfully wrote to fils.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
