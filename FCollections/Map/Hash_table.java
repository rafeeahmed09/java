package FCollections.Map;

import java.util.Hashtable;
import java.util.Map;

public class Hash_table {

    static void main(String[] args) {
        Map<String, Integer> map = new Hashtable<>();
        map.put("new", 1);
        map.put("two" , 2);

        // Retrieve an element using get(key)
        String value = String.valueOf(map.get(2)); // Returns "Banana"

        // Remove an element
        map.remove(1);

        System.out.println("Hashtable: " + map);
    }
}
