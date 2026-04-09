package FCollections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hash {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         // Creating a Maps.
         HashMap<Integer, String> map = new HashMap<>();
         for (int i = 1; i <= 5; i++){
             System.out.print("Enter marks of student " + i + ": ");
             int marks = sc.nextInt();

             System.out.print("Enter name of student " + i + ": ");
             String name = sc.next();

             map.put(marks,name);
         }
         // Display hashMap

         for(Map.Entry<Integer,String> entry : map.entrySet()){
             System.out.println(entry.getKey() + " : " + entry.getValue());
         }

         sc.close();
    }
}
