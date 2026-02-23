package FCollections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        
        // Ordered - maintains insertion order.
        LinkedHashMap<String, Integer> liked = new LinkedHashMap<>(); // Double linked list

        liked.put("Apple", 10);
        liked.put("Orange", 10);
        liked.put("Guava", 13);

        for (Map.Entry<String, Integer> entry : liked.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
        hashMap.put("Shibham", 91);
        hashMap.put("Bob", 23);
        hashMap.put("Akshit", 45);

        Integer val = hashMap.getOrDefault("vipul", 0);
        System.out.println(val);
    }
}
