package Object_Oriented_programmings.Polymorphism;

public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: " + calc.add(10, 20)); 
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));
        System.out.println("Sum of two doubles: " + calc.add(10.5, 20.3));
    }
}

