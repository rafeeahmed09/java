package StreamTreams;

import java.util.ArrayList;
import  java.util.Arrays;
import java.util.List;


public class spilt {
    static void main(int args) {
        List<Integer> li = new ArrayList<>(List.of(1,2,3,4,56,6,7,8,9,10));
        li.parallelStream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 3)
                .spliterator()
                .forEachRemaining(System.out::println);



    }


}
