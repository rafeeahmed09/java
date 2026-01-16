package TR_Maths;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Triangle Enter a base cm :  ");
        Double base = input.nextDouble();
        System.out.print("Triangle Enter a Height cm :   ");
        double Height = input.nextDouble();
        double Area = 0.5 * base * Height;

        System.err.println("Triangle => " + Area + "cm^2");

    }
}
