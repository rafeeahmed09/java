package FCollections.Map;

import java.util.LinkedHashMap;

public class LRCach<K, V> extends LinkedHashMap<K, V> {

    private int capacity;
    public LRCach(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        LRCach<String, Integer> StudentMap = new LRCach(3);
        StudentMap.put("Bob", 99);
        StudentMap.put("Alice", 89);
        StudentMap.put("Neha", 55);
        StudentMap.put("john", 66);
    }
    
}
