package InputStreams_outputStreams.ByteStrams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreams {

    public static void main(String[] args) {

        try (FileInputStream fs = new FileInputStream("C:\\Users\\abdul\\OneDrive\\Desktop\\Code\\java git\\InputStreams_outputStreams\\ByteStrams\\Firat.txt")) {

            int ch;

            while ((ch = fs.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
