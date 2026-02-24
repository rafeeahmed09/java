package Question_java;

import java.util.Scanner;

public class Largest_three {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number:");
        b = sc.nextInt();
        System.out.print("Enter third number: ");
        c = sc.nextInt();
        if(a >= b && a >= c){
            System.out.println("The largest number is: " + a);
        }else if(b >= a && b >= c){
            System.out.println("The largest number is : " + b);
        }else{
            System.out.println("The Largest number is : " + c);
        }
    }

}
