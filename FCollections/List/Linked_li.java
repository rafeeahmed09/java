package FCollections.List;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List; 
import java.util.ArrayList;

public class Linked_li {
    public static void main(String[] args) {
        LinkedList<Integer> lik = new LinkedList<>();
        lik.add(1);
        lik.add(2);
        lik.add(3);
        lik.get(2);
        lik.addLast(4);
        lik.addFirst(0);
        lik.getFirst();
        lik.getLast();
        
        // Remove.
        lik.removeIf(x -> x % 2 == 0);
        System.err.println(lik);
         
        // String
       /*  LinkedList<String> animls = new LinkedList<>(Array.asList("cat", "dog" , "Elephant"));
        LinkedList<String> animalsToReemove = new LinkedList<>(Array.asList("Dog","Lion"));
        animls.removeAll(animalsToReemove);
        System.out.println(animls); */
    }
}
