package Question_java;

import java.util.Scanner;

public class Sum_two_number {
  public static void main(String[] args) {
    int a, b;
    int sum;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number:");
    a = scanner.nextInt();
    System.out.print("Enter second number: ");
    b = scanner.nextInt();
    sum = a + b;
    System.out.println("The sum of two numbers is : " + sum);
    

  }

}
