package Multithreading.Framework;

import java.util.concurrent.CompletableFuture;

public class completableF {

    static void main(String[] args) {
        CompletableFuture<Integer> f1 =
                                     CompletableFuture.supplyAsync(() ->10)
                                             .thenApply(result -> result * 2)
                                             .thenApply(result -> result * 3);


        CompletableFuture<Void> f2 =
                                       CompletableFuture.supplyAsync(() -> 20)
                                               .thenAccept(result -> System.out.println(result));

        CompletableFuture<Void> F3 =
                                       CompletableFuture.supplyAsync(() -> 30 )
                                              .thenRun(() -> System.out.println("Dne"));

        CompletableFuture<Integer> f4 =
                           CompletableFuture.supplyAsync(()->30);

        CompletableFuture<Integer> f5 =
                                 CompletableFuture.supplyAsync(()->30);

        CompletableFuture<Void> result = f4.thenCombine(f5,(x,y)->x+y)
                .thenAccept(x-> System.out.println(x));

//        try {
//            System.out.println(f1.get());
//        } catch (Exception e) {
//
//        }

    }
}
// Inner Thread work in a Fork-join pool Executor.