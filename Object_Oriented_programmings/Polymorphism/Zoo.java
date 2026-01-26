package Object_Oriented_programmings;
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Animal myAnimal1 = new Dog(); // myAnimal1 is a reference of type Animal but points to a Dog object
        Animal myAnimal2 = new Cat(); // myAnimal2 is a reference of type Animal but points to a Cat object

        myAnimal1.makeSound(); 
        myAnimal2.makeSound(); 
    }
}
