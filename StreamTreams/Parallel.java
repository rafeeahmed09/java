package StreamTreams;

 
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Parallel {

    public static void main(String[] args) {

        // parallel Streams allow us to process data in parallel, which can improve performance for large datasets.
        long startTime = System.currentTimeMillis();
        // Generate a list of numbers from 1 to 20,000
        List<Integer> list = Stream.iterate(1, x -> x + 1)
                                   .limit(20000)
                                   .toList();
        List<Long>factorialList = list.parallelStream()
                            .map(Parallel::factorial)
                            .toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with parallel stream: " + (endTime - startTime) + " milliseconds");

        // Without parallel stream
        long stTime = System.currentTimeMillis();
        // Generate a list of numbers from 1 to 20,000
        List<Integer> list2 = Stream.iterate(1, x -> x + 1)
                                   .limit(20000)
                                   .toList();
        List<Long>factorialList3 = list.stream()
                            .map(Parallel::factorial)
                            .toList();
        long Time = System.currentTimeMillis();
        System.out.println("Time taken with sequential stream: " + (Time - stTime) + " milliseconds");


        // Cumulative sum

        // [1,2,3,4,5] --> [1,3,6,10,15]
        List<Integer> numbers5 = Arrays.asList(1,2,3,4,5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = numbers5.stream()
                                            .map(sum::addAndGet)
                                            .toList();
        
        System.out.println("cumulative sum:" + cumulativeSum);
    }                    

    
    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    } 

    
}