package HException;

public class Arithmetic {

    public static void main(String[] args) {
         /*int a = 10;
        int result = 10 / 0;

        System.out.println("Result is : " + result); */

        try { // Exception Generated Statement

            //int b = 10 / 3; // Arithmetic possible
            int b = 10 / 0; // Arithmetic not possible
            System.out.println("Done");
            
        } catch (Exception e) { // Exception Handling Block
            System.out.println("In catch block");
        }

    }
}
