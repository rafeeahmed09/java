package Question_java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        long fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("The factorial of " + n + " is: " + fact);
    }
}
