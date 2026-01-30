package FCollections.Map;

import Object_Oriented_programmings.object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.print.attribute.standard.MediaSize;

// Basic code in Hashmap.
/*public class MHashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Akshit");
        map.put(102, "Neha");
        map.put(103, "Subham");

        System.err.println(map);

        // Check the Student rolls a p using get().
        String Student = map.get(103);
        System.out.println("Name =>" + Student);
        // Check key only containsKey a return a true and false.
        System.out.println("Student => " + map.containsKey(103));
        // Check Value ContainsValue a return a true and false.

        System.out.println("StudentValue => " + map.containsValue("Neha"));
 
        // Print all value using Set.
        Set<Integer> Skey = map.keySet();
        System.err.println("Print the all Student name : ");
        for (int i : Skey) {

            System.err.println(map.get(i));
        }

        // Using the Entry with a print keys & Value.
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        
        for(Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        
        // Value a upperCase.
        for(Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getValue().toUpperCase());
        }
            System.err.println(map);

    }
} */

import java.util.HashMap;
import java.util.Objects;

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person other = (Person) obj;
        return id == other.id &&
               Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }
}
 
public class MHashmap {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();

        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 1);

        map.put(p1, "Engineer");
        map.put(p2, "Designer");
        map.put(p3, "Manager"); // replaces value for p1

        System.out.println("HashMap Size : " + map.size()); // hashcode1 --> index1
        System.out.println("Value for p1 : " + map.get(p1)); // hashcode2 --> index2
        System.out.println("Value for p3 : " + map.get(p3)); // hashcode 1 --> index1 --> equals --> replace.
    }
}

       
       
       
       
       
       
       
       
       
       
       
        // Map<String, Integer> map1 = new HashMap<>();

        // map1.put("Shubham", 90);// Hashcode1 --> index1
        // map1.put("Neha", 92);// Hashcode2 --> index2
        // map1.put("Shubham", 99);// Hashcode --> index --> equals() --> replace
    

