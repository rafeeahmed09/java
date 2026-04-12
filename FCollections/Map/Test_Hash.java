package FCollections.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test_Hash {

    /*
       <Rolls, name> maps
     */

    static void main(String[] args) {
      // <Rolls, name> maps

        Map<Integer,String > map = new HashMap<>();
        map.put(101, "work");
        map.put(102, "bob");
        map.put(103, "sam");

       int size =  map.size();
        System.out.println("maps in size check => " + size);

        boolean check = map.isEmpty();
        System.out.println( "check the map is isEmpty a  not isEmpty => " + check);

        boolean check1 = map.containsKey(101);
        System.out.println("check the containsKey -> " + check1);

        boolean check4 = map.containsValue("work");
        System.out.println("check the containsValue -> " + check4);


        // Advance in maps

        //1. Keyset();
        Set<Integer> set = map.keySet();
        System.out.println("All return a key ->" + set);

        // 2. values
        Collection<String> c =  map.values();
        System.out.println("All return a value -> " + c);

        // 3. Entry maps

        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        System.out.println("All return a data -> " + entrySet);


        // 4. Entry Advance
        Set<Map.Entry<Integer,String>> entry = map.entrySet();
        for (Map.Entry<Integer,String> et : entry){
            Integer keys = et.getKey();
            String value = et.getValue();
            System.out.println("All in maps data");
            System.out.println( keys +  " = " + value);
        }
    }
}
