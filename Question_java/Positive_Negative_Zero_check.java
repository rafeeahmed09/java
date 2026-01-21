package Question_java;

import java.util.Scanner;

public class Positive_Negative_Zero_check {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        // checking number is positive, negative or Zero.
        if (n > 0) {
            System.out.println("The number is positive. ");
        } else if (n < 0) {
            System.out.println("The number is negative. ");
        } else {
            System.out.println("The number is zero. ");
        }
    }
}
