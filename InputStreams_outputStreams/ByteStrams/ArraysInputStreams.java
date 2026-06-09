package InputStreams_outputStreams.ByteStrams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ArraysInputStreams {



    public static void main() {

        byte[] data = {56,57,34,52,50,78};

       try (ByteArrayInputStream BA = new ByteArrayInputStream(data)){
           int  ch = 0;
           while ((ch = BA.read()) != -1) {
               System.out.print((char) ch);
           }

       }catch (IOException e){
           e.getStackTrace();
       }

   }
}
