package Object_Oriented_programmings;

// create a class
class Ins {
    public int age;
    public String name;

    // create a method
    public void display(){
        System.out.println("age is: " + age);
        System.out.println("name is : " + name);
    }
}

public class object {
     
     public static void main(String[] args) {
        // create a object
        Ins obj = new Ins();
        obj.age = 20;
        obj.name = "sumit ";
        obj.display();

     }
}
