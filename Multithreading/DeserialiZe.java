package Multithreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialiZe {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("Multithreading/student.dat");
        ObjectInputStream oos = new ObjectInputStream(fis);

        Student23 s = (Student23) oos.readObject();

        fis.close();
        oos.close();

        System.out.println(s.rollNo + " " + s.name );
    }
}

