package AFunctional;

interface lambda {
    int Multiply(int a, int b);
}

public class LambdaSum{
    public static void main(String[] args) {
        lambda product = (a, b) -> a * b;
        int result = product.Multiply(2, 6);
        System.out.println("product is : " + result);
    }

}
