package Assignment_Sem_4;

 interface Vehicle1 {
     void start();
     void stop();

}
class Car implements Vehicle1 {
    public void start() {
        System.out.println("Car starts with key.");
    }

    public void stop() {
        System.out.println("Car stops with brakes.");
    }
}

class Bike implements Vehicle1 {
    public void start() {
        System.out.println("Bike starts with kick.");
    }

    public void stop() {
        System.out.println("Bike stops with brakes.");
    }
}
public class Vehicle  {
    public static void main(String[] args) {
        Vehicle1 v;

        v = new Car();
        v.start();
        v.stop();

        v = new Bike();
        v.start();
        v.stop();
    }
}
