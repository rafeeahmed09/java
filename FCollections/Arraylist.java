package FCollections;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); // initial capacity of 10 elements.
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        

        System.out.println("All elements of Arraylist are printed \n");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("Using for-each loop \n");
        for (int x : numbers) {
            System.out.println(x);
        }

        System.out.println("Check if an element is present in Arraylist or not \n");
        System.out.println(numbers.contains(5));
        System.out.println(numbers.contains(1));

        System.out.println("Check the size of Arraylist \n");
        System.out.println(numbers.size());

        System.out.println("Added a new element at index 2 \n");
        numbers.add(2, 50);
        for (int y : numbers) {
            System.out.println(y);
        }

        System.out.println("Set a new element at index 2 \n");
        numbers.set(2, 50);
        for (int z : numbers) {
            System.out.println(numbers.get(z));
        }

    }
}
