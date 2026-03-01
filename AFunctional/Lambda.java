package AFunctional;

interface lambdaFunction {
    int add(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        // using lambda expression
        lambdaFunction sum = (a, b) -> a + b;
        int result = sum.add(2, 3);
        System.out.println("sum is : " + result);
    }
}
