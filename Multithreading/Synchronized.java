package Multithreading;

public class Synchronized {
    static void main(String[] args) throws  InterruptedException{
//         Test t = new Test();
//
//         Thread th = new Thread(() -> t.show());
//
//         Thread tr = new Thread(()->t.show());
//
//         th.start();
//         tr.start();

        EvenAndOddNumber t = new  EvenAndOddNumber();
        Thread th = new Thread(() -> t.printNumbers());
        Thread tr = new Thread(()->t.printNumbers());

         th.start();
         tr.start();


    }
}
class Test{

   synchronized void show(){
        System.out.println(Thread.currentThread().getName() + "Imside show");

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.getMessage();
        }

        System.out.println(Thread.currentThread().getName() +"show finish");
    }
}

class EvenAndOddNumber {

    synchronized void printNumbers() {

        try {

            for (int i = 0; i < 10; i++) {

                if (i % 2 == 0) {

                    System.out.println(
                            Thread.currentThread().getName()
                                    + " Even number: " + i
                    );

                } else {

                    System.out.println(
                            Thread.currentThread().getName()
                                    + " Odd number: " + i
                    );
                }

                Thread.sleep(2000);
            }

            System.out.println("Finished");

        } catch (InterruptedException e) {

            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}