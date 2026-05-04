package Multithreading;
public class Thread_LifeCycle {
    static void main(String[] args) {
        // 1. Thread New Stage
        Thread mainThread = Thread.currentThread();
        Thread t1 = new Thread(() ->{
            System.out.println("Name of current thread is " + Thread.currentThread().getName());
            System.out.println("Main thread state " + mainThread.getState());
        });

        System.out.println(t1.getState());

        // 2. Runnable stage
        t1.start();
        System.out.println(t1.getState());// Runnable, Terminated

        // Method Sleep
        try{

            Thread.sleep(2000);
        }catch (Exception e){
            e.getMessage();
        }

        System.out.println(t1.getState()); // Terminated
    }


}
