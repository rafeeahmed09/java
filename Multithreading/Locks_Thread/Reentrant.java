package Multithreading.Locks_Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrant {
    static void main(String[] args) {
        Resource R1 = new Resource();

        Thread t1 = new Thread(() -> R1.f2());

        Thread t2 = new Thread(() -> R1.f2());

        Thread t3 = new Thread(() -> R1.f2());

        t1.start();
        t2.start();
        t3.start();
    }

}
class Resource{
    Lock lock = new ReentrantLock();

    void f2(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+"Entered");

            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){}
                System.out.println(Thread.currentThread().getName()+"exited");

        }

        finally {
            lock.unlock();
        }
    }
}
