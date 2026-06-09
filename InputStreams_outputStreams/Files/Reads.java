package InputStreams_outputStreams.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Reads {

    static void main() throws IOException {
        Path path = Paths.get("InputStreams_outputStreams/Files/student.txt");
        List<String> lin = Files.readAllLines(path);

        for(String line : lin){
            System.out.println(line);
        }
    }
}
