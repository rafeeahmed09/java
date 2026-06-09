package InputStreams_outputStreams.charactersStream.Reder_writer;

import java.io.*;

public class BufferReader_BufferWriter {

    static void main() {

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("C:\\Users\\abdul\\OneDrive\\Desktop\\Code\\java git\\InputStreams_outputStreams\\ByteStrams\\Firat.txt"))) {

            writer.write("Hi Java");
            writer.newLine();
            writer.write("Rafee Ahmed");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader Reader = new BufferedReader(new FileReader("C:\\Users\\abdul\\OneDrive\\Desktop\\Code\\java git\\InputStreams_outputStreams\\ByteStrams\\Firat.txt"))){

            String line;
            while ((line = Reader.readLine()) != null) {
                System.out.println(line);
            }

            Reader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
