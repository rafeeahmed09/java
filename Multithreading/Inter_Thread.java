package Multithreading;

public class Inter_Thread {
    static void main(String[] args) {

        Box box = new Box();
        Thread th = new Thread(() -> {
            for (int i = 1; i<= 20; i++){
                try{
                    box.Produce(i);
                    Thread.sleep(100);
                }catch (InterruptedException e){}
            }
        });
        Thread th2 = new Thread(() -> {
            for (int i = 1; i<= 20; i++){
                try{
                    box.consume();
                    Thread.sleep(70);
                }catch (InterruptedException e){}

            }
        });

        th.start();
        th2.start();

    }
}

class Box{
  volatile Integer value;
  volatile Boolean fag = false;


    synchronized void Produce(int items) throws InterruptedException {
        while(fag == true){
            wait();
        }
        value = items;
        fag = true;

        System.out.println("Product product" + value);
        notify();
    }
    synchronized void consume() throws InterruptedException {
        while(fag == false){
            wait();
        }
        System.out.println("Consume consume" + value);

        value = null;
        fag = false;
        notify();
    }
}