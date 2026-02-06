package StreamTreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class intermediate_operations {
    public static void main(String[] args) {
        // Intermediate operations transform a stream into another stream.
        // They are lazy, meaning they deon't execute until a terminal operation is
        // invoked.
        /*  Example of intermediate operations: Filter, Map, flatMap, distinct, sorted,
         peek, limit, skip. */
        
        // 1. Filter
        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam");
        Stream<String> filteredList = list.stream().filter(x -> x.startsWith("A"));
        long result = filteredList.limit(4).count();
        System.out.println("The a Filtered count is: " + result);

        // 2. Map 
        List<String> list2 = Arrays.asList("neha", "ansh", "fiza","harsh");
        Stream<String> mappedlist = list2.stream().map(x -> x.toUpperCase());

    }
}
