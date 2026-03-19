package File_Handling;

import java.io.File;
import java.lang.reflect.Field;

public class Delete {
    static void main(String[] args) {
        File myfile = new File("acb.txt");
        if (myfile.delete()){
            // deleted a file.
            System.out.println("i have deleted" + myfile.getName());

        }else{
            System.out.println("Some problem occurred while");
        }
    }

}


