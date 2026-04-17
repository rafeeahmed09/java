package Assignment_Sem_4;

abstract class Shap1{
    abstract void area();
    // concrete method
    void display(){
        System.out.println("This is a shop");
    }
}
class Circle extends Shap1{
    double redius = 5;
    void area(){
        double result = 3.14 * redius * redius;
        System.out.println("Area of circle " + result);
    }
}
class Rectangle extends Shap1{
    int length = 10, width = 5;

    void area(){
        int result = length * width;
        System.out.println("Area of rectangle is " + result);
    }
}


public class Shape {
    public static void main(String[] args){
        Shap1 shap1 = new Circle();
        shap1.area();
        shap1.display();
    }
}
