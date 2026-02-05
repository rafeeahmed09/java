package AFunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FConsumer {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<List<Integer>> printList = l -> {
            for (int i : l) {
                System.out.println(i);
            }
        };

        printList.accept(list);
    }
}