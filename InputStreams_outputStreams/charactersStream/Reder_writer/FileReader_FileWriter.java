package InputStreams_outputStreams.charactersStream.Reder_writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_FileWriter {

    static void main() {

        try(FileWriter fe = new FileWriter("C:\\Users\\abdul\\OneDrive\\Desktop\\Code\\java git\\InputStreams_outputStreams\\ByteStrams\\Firat.txt");)
        {
            fe.write("Hole Rafee bhai");
            fe.close();

        }catch (IOException e){
            e.getStackTrace();
        }

        try (FileReader reader = new FileReader("C:\\Users\\abdul\\OneDrive\\Desktop\\Code\\java git\\InputStreams_outputStreams\\ByteStrams\\Firat.txt");)
        {

            int ch = 0;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        }catch (IOException e){
            e.getStackTrace();
        }

    }
}
