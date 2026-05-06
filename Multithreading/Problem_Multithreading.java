package Multithreading;



public class Problem_Multithreading  {
    static volatile boolean  flay = false;
    static void main(String[] args) throws InterruptedException {
        // Race Condition
        Counter c1  = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i =1; i<=1000; i++){
                c1.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i =1; i<=10000; i++){
                c1.increment();
            }
        });

        t1.start();
        t2.start();


        t1.join();
        t2.join();
        System.out.println(c1.count);


        // Visibility
        Thread t3 = new Thread(() ->{
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
            flay = true;

        });
        Thread t4 = new Thread(()->{
            while (!flay){
//                System.out.println("Thread 4 Running : ");
                // do nothing
            }
            System.out.println("Thread 4 Running finished");
        });


        t3.start();
        t4.start();



    }
}

class Counter {
    int count = 0;
    void increment(){
        count++;
    }

}
