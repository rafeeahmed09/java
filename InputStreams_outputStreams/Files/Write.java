package InputStreams_outputStreams.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class Write {

    static void main() throws IOException {

        Path path = Paths.get("InputStreams_outputStreams/Files/student.txt");

        String msg = "package InputStreams_outputStreams.charactersStream.Reder_writer;\n" +
                "\n" +
                "import java.io.*;\n" +
                "\n" +
                "public class BufferReader_BufferWriter {\n" +
                "\n" +
                "    static void main() {\n" +
                "\n" +
                "        try (BufferedWriter writer = new BufferedWriter(\n" +
                "                new FileWriter(\"C:\\\\Users\\\\abdul\\\\OneDrive\\\\Desktop\\\\Code\\\\java git\\\\InputStreams_outputStreams\\\\ByteStrams\\\\Firat.txt\"))) {\n" +
                "\n" +
                "            writer.write(\"Hi Java\");\n" +
                "            writer.newLine();\n" +
                "            writer.write(\"Rafee Ahmed\");\n" +
                "\n" +
                "        } catch (IOException e) {\n" +
                "            e.printStackTrace();\n" +
                "        }\n" +
                "\n" +
                "        try(BufferedReader Reader = new BufferedReader(new FileReader(\"C:\\\\Users\\\\abdul\\\\OneDrive\\\\Desktop\\\\Code\\\\java git\\\\InputStreams_outputStreams\\\\ByteStrams\\\\Firat.txt\"))){\n" +
                "\n" +
                "            String line;\n" +
                "            while ((line = Reader.readLine()) != null) {\n" +
                "                System.out.println(line);\n" +
                "            }\n" +
                "\n" +
                "            Reader.close();\n" +
                "        }catch (IOException e) {\n" +
                "            e.printStackTrace();\n" +
                "        }\n" +
                "    }\n" +
                "}";

        Files.write(path, Collections.singleton(msg));
        System.out.println("Data Written Successfully");
    }
}
