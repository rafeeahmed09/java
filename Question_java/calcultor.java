package Question_java;

import java.util.Scanner;

public class calcultor {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Enter first number ");
        double num1 = src.nextDouble();

        System.out.println("Enter second number");
        double num2 = src.nextDouble();

        System.err.println("Choose operation");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.print("Enter operator: ");
        char op = src.next().charAt(0);

        double result;

        switch (op) {
            case '1':
                result = num1 + num2;
                break;
            case '2':
                result = num1 - num2;
                break;
            case '3':
                result = num1 * num2;
                break;
            case '4':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result = " + result);
        src.close();
    }
}
