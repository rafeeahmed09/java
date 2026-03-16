package File_Handling;

import java.io.File;
import java.io.IOException;


public class Creating_a_File {

    static void main(String[] args) {
        // Create a new File.
        File myField = new File("File_Handling/acb.txt");
        try{
            myField.createNewFile();
            System.out.println("Create a file");
        }catch (IOException e){
            e.getStackTrace();
        }
    }
}
