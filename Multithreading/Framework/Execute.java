package Multithreading.Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Execute {
    // Executor

    static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // number of task 5
        for (int i = 1; i <= 5; i++) {
            int taslId = i;
            executor.execute(() -> {
                System.out.println("Task" + taslId + "is Perfromed by" + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }

}
