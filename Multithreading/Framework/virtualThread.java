package Multithreading.Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class virtualThread {
    static void main(String[] args) {
        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();

        for (int i = 0; i<= 10; i++){
            executorService.submit(()->{
                System.out.println("Hello World");
            });

            executorService.shutdown();
        }
    }
}
