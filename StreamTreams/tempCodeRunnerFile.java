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

        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam");
        Stream<String> filteredList = list.stream().filter(x -> x.startsWith("A"));
        // not filtering at this point.
        long result = filteredList.limit(4).count();
        System.out.println("The a Filtered count is: " + result);
    }
}
