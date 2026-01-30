package FCollections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> liked = new LinkedHashMap<>(); // Double linked list

        liked.put("Apple", 10);
        liked.put("Orange", 10);
        liked.put("Guava", 13);

        for (Map.Entry<String, Integer> entry : liked.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
