package StreamTreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        List<String> List5 = Arrays.asList("alice", "bob", "charlie", "david");
        Stream<String> stream = List5.stream()
                .filter(name -> {
                   
                    return name.length() > 3;
                });
                     List<String> result = stream.collect(Collectors.toList());
                     System.out.println(result);
            }
}
