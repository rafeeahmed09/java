package Assignment_Sem_4;

public class operators_1 {

     public static void main(String[] args) {

         int a = 4;
         int b = 10;

         // 1. Arithmetic Operators
         System.out.println("Arithmetic Operators:");
         System.out.println("Addition: " + (a + b));
         System.out.println("Subtraction: " + (a - b));
         System.out.println("Multiplication: " + (a * b));
         System.out.println("Division: " + (a / b));
         System.out.println("Modulus: " + (a % b));

         // 2. Relational Operators
         System.out.println("\n Relational Operators: ");
         System.out.println("a > b: " + (a > b));
         System.out.println("a < b: " + (a < b));
         System.out.println("a == b: " + (a == b));
         System.out.println("a != b: " + (a != b));

         // 3. Logical Operators
         System.out.println("Logical Operators:");
         System.out.println("(a > b && b > 0): " + (a > b && b > 0));
         System.out.println("(a > b || b < 0): " + (a > b || b < 0));
         System.out.println("!(a > b): " + !(a > b));

         // 4.Assignment Operators
         System.out.println("Assignment Operators:");
         System.out.println("\nAssignment Operators:");
         int c = a;
         System.out.println("c = a: " + c);
         c += b;
         System.out.println("c += b: " + c);
         c *= b;
         System.out.println("c *= b: " + c);

         // 5 Unary Operators
         System.out.println("\nUnary Operators:");
         int x = 5;
         System.out.println("Initial x: " + x);
         System.out.println("x++: " + (x++));
         System.out.println("After x++: " + x);
         System.out.println("++x: " + (++x));

         // 6.Bitwise Operators
         System.out.println("\nBitwise Operators:");
         System.out.println("a & b: " + (a & b));
         System.out.println("a | b: " + (a | b));
         System.out.println("a ^ b: " + (a ^ b));

         // 7. Ternary Operator
         System.out.println("\nTernary Operator:");
         int max = (a > b) ? a : b;
         System.out.println("Maximum of a and b: " + max);



     }
}
