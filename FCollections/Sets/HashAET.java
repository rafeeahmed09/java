package FCollections.Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.*;


public class HashAET {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(67);

        System.out.println(set);
    }
}