package InputStreams_outputStreams.Files;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class createFiles {

    static void main()  {


        try {
            Path path = Paths.get("InputStreams_outputStreams/Files/Demo.java");
            Files.createFile(path);

            System.out.println("Files create a Successfully");
        }catch (IOException e){
            e.getStackTrace();
        }
    }
}
