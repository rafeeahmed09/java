package AFunctional;

import java.util.function.Predicate;

public class FPredicate {
    // Functional interface for a predicate that takes an integer and returns a
    // boolean value.

    public static void main(String[] args) {
        // Example usage of the Predicate functional interface.
        Predicate<Integer> isodd = n -> n % 2 != 0; // lambda expression to check if a number is odd.
        int number = 4;
        boolean result = isodd.test(number); // test the predicate with the number 4.
        System.out.println("IS number odd ? " + result);
    }
}
