package InputStreams_outputStreams.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class delete {

    static void main() throws IOException {
        Path path = Paths.get("InputStreams_outputStreams/Files/student.txt");

        Files.delete(path);

        System.out.println("Files a Deleted ");
    }

}
