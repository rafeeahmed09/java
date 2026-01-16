package TR_Maths;
import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter all 4 sid in cm  ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double Perimeter = a + b + c + d;

        System.err.println("Perimeter of your " + Perimeter + "cm");

    }
}
