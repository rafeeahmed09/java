package StreamTreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Terminal_operations {
    public static void main(String[] args) {
         List<Integer> number = java.util.Arrays.asList(1,2,3,4,5,6,7,8,9,10);


        // 1. collect:
        List<Integer> collectedlist = number.stream().skip(1).collect(Collectors.toList());
        System.out.println("Collected list: " + collectedlist);
        // 2. forEach:

        System.out.println("forEach :" );
        number.stream().forEach(x -> System.out.println(x));

        // 3. reduce:
        Optional<Integer> optionalSum = number.stream().reduce((x, y) -> x + y);
        System.out.println("Sum using reducr: " + optionalSum.get());

        // 4. anyMatch, allMatch, noneMatch:
        boolean anyMatch = number.stream().anyMatch(x -> x % 2 == 0);
        System.out.println("Any Match: " + anyMatch);
        boolean allMatch = number.stream().allMatch(x -> x > 0);
        System.out.println("All Match: " + allMatch);
        boolean noneMatch = number.stream().noneMatch(x -> x < 0);
        System.out.println("None Match: " + noneMatch);

        // Example of terminal operations:
        List<String> list = Arrays.asList("Anna", "Bob", "Charlie","David");
        System.out.println( list.stream().filter(x -> x.length() > 3).toList());

        // Example : squaring and sorting Numbers
        List<Integer> numbers1 = Arrays.asList(5,2,9,1,6);
        System.out.println(numbers1.stream().map(x -> x * x).sorted().toList()); 

        // Example : Summing Values
        System.out.println(numbers1.stream().reduce((x, y) -> (x  + y)).get());
        
        // Example : counting occurrences of a character.
        String str = "Hello world";
        System.out.println(str.chars().filter(x -> x == 'l').count());


             
    }
    
}
   