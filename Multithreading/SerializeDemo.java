package Multithreading;
import java.io.*;
class Student23 implements Serializable {
    int rollNo;
    String name;
    Student23(int r, String n){
        rollNo = r;
        name = n;
    }
}
public class SerializeDemo {
    public static void main(String[] args) {

        try
        {

            Student23 s = new Student23(101, "Rahul");
            FileOutputStream fos = new FileOutputStream("Multithreading/student.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();
            fos.close();
            System.out.println("Object Serialized Successfully");
        }  catch(Exception e) {
            System.out.println(e);
        }
    }
}
