package Interfaces;

public class Multiple_Inheritance {
    public static void main(String[] args) {
        // You can use the interface as the reference type
        add a = new sum();
        sub b = new sum();

        // Or use the class type to access both methods at once
        sum s = new sum();

        System.out.println("Addition: " + a.vale(10, 5));
        System.out.println("Subtraction: " + b.vale1(10, 5));
        System.out.println("Both from 's': " + s.vale(20, 10) + " and " + s.vale1(20, 10));
    }
}

interface add {
    int vale(int a, int b);
}

interface sub {
    int vale1(int a, int b);
}

// This class successfully implements multiple inheritance
class sum implements add, sub {
    @Override
    public int vale(int a, int b) {
        return a + b;
    }

    @Override
    public int vale1(int a, int b) {
        return a - b;
    }
}
