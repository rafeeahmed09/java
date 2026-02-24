package StreamTreams;

import java.io.InputStream;
import java.io.FileInputStream;

public class INPUTSTREAM {
    public static void main(String[] args) {
        try{
            InputStream input = new FileInputStream(tet.text);
            input.available()
        }catch(Exception e){
            System.out.println("error : " + e.getMessage());
        }
    }
}
