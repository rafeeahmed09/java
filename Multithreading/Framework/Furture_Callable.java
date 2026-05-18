package Multithreading.Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Furture_Callable {

//    static void main(String[] args) {
//        ExecutorService   service = Executors.newFixedThreadPool(2);
//
//        Future<Integer> f1 = service.submit(() -> {
//            try{
//                Thread.sleep(3000);
//            }catch (InterruptedException e){}
//
//            return 10;
//        });
//        try{
//            System.out.println(f1.get());
//        }catch (Exception e){}
//
//        service.shutdown();
//    }

    static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(2);
           executor.execute(()->{
               int x = 10 / 0;
           });

           Future<Integer> f1 = executor.submit(()->{
               return (10/ 0);
           });

           try{
               System.out.println(f1.get());
           }catch (Exception e){
               System.out.println("Catched Exception");
           }
    }
}
