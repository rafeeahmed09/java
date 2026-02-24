package Question_java;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println( " is even number list =>" + i);
            } else {
                System.out.println( " is odd number list => " + i);
            }
        }
    }
}
