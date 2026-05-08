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

//        EvenAndOddNumber t = new  EvenAndOddNumber();
//        Thread th = new Thread(() -> t.printNumbers());
//        Thread tr = new Thread(()->t.printNumbers());
//
//         th.start();
//         tr.start();

        Bank b = new Bank(1000);
        Thread th = new Thread(() -> b.deposit(3000));
        Thread th2 = new Thread(() -> b.withdraw(500));

        th.start();
        th2.start();

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

class Bank{
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        synchronized (Bank.class) {
            try {
                if (amount > 0)
                    balance += amount;
                System.out.println(
                        Thread.currentThread().getName()
                                + " amount: " + amount
                );

                Thread.sleep(2000);
            }catch (Exception e){

            }

        }
    }
    void withdraw(double amount) {
         synchronized (Bank.class) {
             try {
                 if (amount > 0 && balance >= amount)
                     balance -= amount;
                 Thread.sleep(2000);
                 System.out.println(
                         Thread.currentThread().getName()
                                 + " Withdraw " + amount
                 );
               }catch (Exception e){

             }

         }
    }
}