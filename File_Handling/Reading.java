package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Reading {
    static void main(String[] args) {
        File myFile = new File("acb.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNext()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
