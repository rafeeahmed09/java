package File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("acb.txt");
            fileWriter.write("This is our first file from this java");
            fileWriter.close();
            System.out.println("Successfully wrote to the file!");
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}