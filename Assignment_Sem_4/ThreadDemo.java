package Assignment_Sem_4;

class Shared {
    int data;
    boolean hasData = false;

    synchronized void produce(int value) {
        try {
            while (hasData) {
                wait();
            }
            data = value;
            System.out.println("Produced: " + data);
            hasData = true;
            notify(); // notify consumer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void consume() {
        try {
            while (!hasData) {
                wait();
            }
            System.out.println("Consumed: " + data);
            hasData = false;
            notify(); // notify producer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Producer extends Thread {
    Shared s;

    Producer(Shared s) {
        this.s = s;
        setPriority(Thread.MAX_PRIORITY);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            s.produce(i);
        }
    }
}

class Consumer extends Thread {
    Shared s;

    Consumer(Shared s) {
        this.s = s;
        setPriority(Thread.MIN_PRIORITY);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            s.consume();
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Shared s = new Shared();

        Producer p = new Producer(s);
        Consumer c = new Consumer(s);

        System.out.println("Producer Priority: " + p.getPriority());
        System.out.println("Consumer Priority: " + c.getPriority());

        p.start();
        c.start();
    }
}
